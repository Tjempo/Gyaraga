package com.github.hanyaeger.Gyaraga.entities.mobs;

import com.github.hanyaeger.Gyaraga.entities.projectile.ProjectileType;
import com.github.hanyaeger.api.Coordinate2D;

public class ShotgunGun extends Mob{
    public ShotgunGun(Coordinate2D location, ProjectileType weapon) {
        super("sprites/shotgun.png", location, weapon);
    }
}
