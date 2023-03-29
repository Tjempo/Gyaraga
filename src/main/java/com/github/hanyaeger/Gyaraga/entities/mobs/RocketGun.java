package com.github.hanyaeger.Gyaraga.entities.mobs;

import com.github.hanyaeger.Gyaraga.entities.projectile.ProjectileType;
import com.github.hanyaeger.api.Coordinate2D;

public class RocketGun extends Mob{
    public RocketGun(Coordinate2D location, ProjectileType weapon) {
        super("sprites/launcher.png", location, weapon);
    }
}
