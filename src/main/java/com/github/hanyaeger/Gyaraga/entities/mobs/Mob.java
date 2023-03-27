package com.github.hanyaeger.Gyaraga.entities.mobs;

import com.github.hanyaeger.Gyaraga.entities.projectile.Projectile;
import com.github.hanyaeger.Gyaraga.entities.projectile.ProjectileFactory;
import com.github.hanyaeger.Gyaraga.entities.projectile.ProjectileType;
import com.github.hanyaeger.Gyaraga.entities.projectile.weapons.Laser;
import com.github.hanyaeger.Gyaraga.scenes.GameLevel1;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import javafx.scene.Node;

import java.util.Optional;

public class Mob extends DynamicSpriteEntity implements Collided{
    public int health;
    protected ProjectileType weapon;

    public Mob(String spriteDir, Coordinate2D location, ProjectileType weapon) {
        super(spriteDir, location);
        this.weapon = weapon;
    }

    public void shootProjectile(Mob shooter){
//        System.out.println("Shoot @" + getLocationInScene());
//        System.out.println("Weapon:" + weapon);
        Projectile bullet = ProjectileFactory.getProjectile(weapon, shooter instanceof Player);
        GameLevel1.instance.addEntity(bullet);
        bullet.shoot(getLocationInScene());
    }

    @Override
    public void onCollision(Collider collider) {
        ((Projectile)collider).hitMob(this);
    }
}
