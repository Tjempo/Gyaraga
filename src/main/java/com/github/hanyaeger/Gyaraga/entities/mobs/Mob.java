package com.github.hanyaeger.Gyaraga.entities.mobs;

import com.github.hanyaeger.Gyaraga.entities.projectile.Projectile;
import com.github.hanyaeger.Gyaraga.entities.projectile.ProjectileFactory;
import com.github.hanyaeger.Gyaraga.entities.projectile.ProjectileType;
import com.github.hanyaeger.Gyaraga.entities.projectile.weapons.Laser;
import com.github.hanyaeger.Gyaraga.scenes.GameLevel;
import com.github.hanyaeger.Gyaraga.scenes.GameLevel1;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import javafx.geometry.Point2D;
import javafx.scene.Node;

import java.util.Optional;

public class Mob extends DynamicSpriteEntity implements Collided{
    public int health;

    protected ProjectileType weapon;

    public Mob(String spriteDir, Coordinate2D location, ProjectileType weapon){
        super(spriteDir, location);
        this.weapon = weapon;
    }

    public void shootProjectile(Mob shooter){
        System.out.print("PEW: ");
        System.out.println(weapon);

        if (weapon == ProjectileType.SHELL) {
            Projectile shell1 = ProjectileFactory.getProjectile(weapon, shooter instanceof Player);
            Projectile shell2 = ProjectileFactory.getProjectile(weapon, shooter instanceof Player);
            Projectile shell3 = ProjectileFactory.getProjectile(weapon, shooter instanceof Player);
            Projectile shell4 = ProjectileFactory.getProjectile(weapon, shooter instanceof Player);
            Projectile shell5 = ProjectileFactory.getProjectile(weapon, shooter instanceof Player);
            GameLevel.instance.addEntity(shell1);
            GameLevel.instance.addEntity(shell2);
            GameLevel.instance.addEntity(shell3);
            GameLevel.instance.addEntity(shell4);
            GameLevel.instance.addEntity(shell5);
            shell1.shoot(new Coordinate2D(getLocationInScene().getX() + 22, getLocationInScene().getY()));
            shell2.shoot(new Coordinate2D(getLocationInScene().getX() + 11, getLocationInScene().getY()));
            shell3.shoot(getLocationInScene());
            shell4.shoot(new Coordinate2D(getLocationInScene().getX() - 11, getLocationInScene().getY()));
            shell5.shoot(new Coordinate2D(getLocationInScene().getX() - 22, getLocationInScene().getY()));
        } else {
            Projectile bullet = ProjectileFactory.getProjectile(weapon, shooter instanceof Player);
            GameLevel.instance.addEntity(bullet);
            bullet.shoot(getLocationInScene());
        }
    }

    @Override
    public void onCollision(Collider collider) {
        ((Projectile)collider).hitMob(this);
    }
}

