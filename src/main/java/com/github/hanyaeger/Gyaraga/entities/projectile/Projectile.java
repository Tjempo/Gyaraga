package com.github.hanyaeger.Gyaraga.entities.projectile;

import com.github.hanyaeger.Gyaraga.entities.mobs.Mob;
import com.github.hanyaeger.Gyaraga.entities.mobs.Player;
import com.github.hanyaeger.Gyaraga.entities.mobs.enemy.Enemy;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import javafx.scene.Node;


public class Projectile extends DynamicSpriteEntity implements Collider{
    protected int damage;
    protected int speed;
    protected boolean firedByPlayer;

    public Projectile(String spriteDir, int damage, int speed, boolean firedByPlayer) {
        super(spriteDir, new Coordinate2D(-50, -50));
        this.damage = damage;
        this.speed = speed;
        this.firedByPlayer = firedByPlayer;
    }

    public void hitMob(Mob mob) {
        if ((firedByPlayer == true && mob instanceof Enemy) || (firedByPlayer == false && mob instanceof Player)) {
            mob.health -= damage;
            System.out.println(mob.health);
            setAnchorLocation(new Coordinate2D(-50, -50));
        }
        if (mob.health < 1) {
            mob.remove();
            System.out.println("");
        }
    }

    public void shoot(Coordinate2D location){
        setAnchorLocation(location);
        setMotion(speed, this.getDirection());
    }

    @Override
    public String toString() {
        return "Projectile{" +
                "damage=" + damage +
                ", speed=" + speed +
                '}';
    }
}
