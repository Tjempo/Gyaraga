package com.github.hanyaeger.Gyaraga.entities.projectile.weapons;

import com.github.hanyaeger.Gyaraga.entities.mobs.Mob;
import com.github.hanyaeger.Gyaraga.entities.projectile.Projectile;
import com.github.hanyaeger.api.Coordinate2D;

public class Laser extends Projectile {
    public Laser(boolean firedByPlayer) {
        super("sprites/laserBullet.png", 10, 5, firedByPlayer, 1, 1);
    }
}
