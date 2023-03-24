package com.github.hanyaeger.Gyaraga.entities.mobs;

import com.github.hanyaeger.Gyaraga.entities.projectile.Projectile;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import javafx.scene.Node;

import java.util.Optional;

public class Mob extends DynamicSpriteEntity implements Collided{
    public int health;
    protected Projectile weapon;

    public Mob(String spriteDir, Coordinate2D location, Projectile weapon) {
        super(spriteDir, location);
        this.weapon = weapon;
    }

    public void shootProjectile(){
//        System.out.println("Shoot @" + getLocationInScene());
//        System.out.println("Weapon:" + weapon);
        weapon.shoot(getLocationInScene());
    }

    @Override
    public void onCollision(Collider collider) {
        ((Projectile)collider).hitMob(this);
    }
}
