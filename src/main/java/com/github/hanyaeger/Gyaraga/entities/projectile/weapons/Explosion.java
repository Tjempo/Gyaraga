package com.github.hanyaeger.Gyaraga.entities.projectile.weapons;

import com.github.hanyaeger.Gyaraga.entities.mobs.Mob;
import com.github.hanyaeger.Gyaraga.entities.projectile.Projectile;
import com.github.hanyaeger.api.Coordinate2D;

public class Explosion extends Projectile {
    public Explosion(boolean firedByPlayer) {
        super("sprites/explosion.png", 25, 0, firedByPlayer);
    }
}
