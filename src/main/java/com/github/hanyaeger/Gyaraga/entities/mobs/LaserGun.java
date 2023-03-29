package com.github.hanyaeger.Gyaraga.entities.mobs;

import com.github.hanyaeger.Gyaraga.entities.projectile.ProjectileType;
import com.github.hanyaeger.api.Coordinate2D;

public class LaserGun extends Mob{
    public LaserGun(Coordinate2D location, ProjectileType weapon) {
        super("sprites/laserGun.png", location, weapon);
    }
}
