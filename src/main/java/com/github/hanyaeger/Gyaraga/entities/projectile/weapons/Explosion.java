package com.github.hanyaeger.Gyaraga.entities.projectile.weapons;

import com.github.hanyaeger.Gyaraga.entities.mobs.Mob;
import com.github.hanyaeger.Gyaraga.entities.mobs.Player;
import com.github.hanyaeger.Gyaraga.entities.mobs.enemy.Enemy;
import com.github.hanyaeger.Gyaraga.entities.projectile.Projectile;
import com.github.hanyaeger.api.media.SoundClip;

import java.util.TimerTask;


public class Explosion extends Projectile {

    public Explosion(boolean firedByPlayer) {
        super("sprites/explosion.png", 25, 0, firedByPlayer, 1, 7);
        setAutoCycle(50);
    }

//    @Override
//    public void hitMob(Mob mob) {
//        if ((firedByPlayer == true && mob instanceof Enemy) || (firedByPlayer == false && mob instanceof Player)) {
//            mob.health -= damage;
//
//            System.out.print("MOB HP:");
//            System.out.println(mob.health);
//
//            var boomSound = new SoundClip("audio/vineBoom.mp3");
//            boomSound.play();
//
//            this.remove();
//        }
//        if (mob.health < 1) {
//            mob.remove();
//        }
//    }
}
