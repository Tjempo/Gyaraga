package com.github.hanyaeger.Gyaraga.entities.projectile;

import com.github.hanyaeger.Gyaraga.Gyaraga;
import com.github.hanyaeger.Gyaraga.entities.mobs.Mob;
import com.github.hanyaeger.Gyaraga.entities.mobs.Player;
import com.github.hanyaeger.Gyaraga.entities.mobs.enemy.Enemy;
import com.github.hanyaeger.Gyaraga.entities.mobs.enemy.enemies.Bomber;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.media.SoundClip;
import com.github.hanyaeger.api.scenes.SceneBorder;


public class Projectile extends DynamicSpriteEntity implements Collider, SceneBorderCrossingWatcher {
    protected int damage;
    protected int speed;
    private Gyaraga gyaraga;
    public boolean firedByPlayer;

    public Projectile(String spriteDir, int damage, int speed, boolean firedByPlayer, int rows, int colums) {
        super(spriteDir, new Coordinate2D(-50, -50), rows, colums);
        this.damage = damage;
        this.speed = speed;
        this.firedByPlayer = firedByPlayer;
    }

    public void hitMob(Mob mob) {
        if ((firedByPlayer == true && mob instanceof Enemy) || (firedByPlayer == false && mob instanceof Player)) {
            mob.health -= damage;

            System.out.print("MOB HP:");
            System.out.println(mob.health);

            var boomSound = new SoundClip("audio/vineBoom.mp3");
            boomSound.play();

            this.remove();
        }
        if (mob.health < 1) {
            mob.remove();
            if (mob instanceof Bomber) {
                ((Bomber) mob).execAbility();
            }
        }
    }

    public void shoot(Coordinate2D location){
        setAnchorLocation(location);
        System.out.println(location);
        System.out.println(speed);
        if (firedByPlayer) {
            setMotion(speed, 180d);
        } else {
            setMotion(speed, 0d);
        }
    }

    @Override
    public String toString() {
        return "Projectile{" +
                "damage=" + damage +
                ", speed=" + speed +
                '}';
    }

    @Override
    public void notifyBoundaryCrossing(SceneBorder sceneBorder) {
        this.remove();
    }
}
