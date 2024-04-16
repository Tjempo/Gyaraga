package com.github.hanyaeger.Gyaraga.entities.projectile;

import com.github.hanyaeger.Gyaraga.entities.projectile.weapons.*;

public class ProjectileFactory {
    public static Projectile getProjectile(ProjectileType projectileType, boolean firedByPlayer) {
        if (projectileType == ProjectileType.LASER) {
            return new Laser(firedByPlayer);
        } else if (projectileType == ProjectileType.BALL) {
            return new Ball(firedByPlayer);
        } else if (projectileType == ProjectileType.EXPLOSION) {
            return new Explosion(firedByPlayer);
        } else if (projectileType == ProjectileType.ROCKET) {
            return new Rocket(firedByPlayer);
        } else if (projectileType == ProjectileType.SHELL) {
            return new Shell(firedByPlayer);
        }
        return null;
    }
}
