package com.github.hanyaeger.Gyaraga.entities.projectile.weapons;

import com.github.hanyaeger.Gyaraga.entities.mobs.Mob;
import com.github.hanyaeger.Gyaraga.entities.mobs.Player;
import com.github.hanyaeger.Gyaraga.entities.mobs.enemy.Enemy;
import com.github.hanyaeger.Gyaraga.entities.projectile.Projectile;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.TimerContainer;
import com.github.hanyaeger.api.media.SoundClip;

public class
Explosion extends Projectile implements TimerContainer {
    ExplosionTimer explosionTimer;

    public Explosion(boolean firedByPlayer) {
        super("sprites/explosion.png", 25, 0, firedByPlayer, 1, 7);
        setAutoCycle(50);
        explosionTimer = new ExplosionTimer(this);
        setupTimers();
    }

    @Override
    public void setupTimers() {
        addTimer(explosionTimer);
    }

    @Override
    public void hitMob(Mob mob) {
        if ((firedByPlayer == true && mob instanceof Enemy) || (firedByPlayer == false && mob instanceof Player)) {
            mob.health -= damage;

            System.out.print("MOB HP:");
            System.out.println(mob.health);

            var boomSound = new SoundClip("audio/vineBoom.mp3");
            boomSound.play();
        }

        if (mob.health < 1) {
            mob.remove();
        }
    }
}

