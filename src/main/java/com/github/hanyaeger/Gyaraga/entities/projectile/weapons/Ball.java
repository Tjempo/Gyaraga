package com.github.hanyaeger.Gyaraga.entities.projectile.weapons;

import com.github.hanyaeger.Gyaraga.entities.mobs.Mob;
import com.github.hanyaeger.Gyaraga.entities.projectile.Projectile;
import com.github.hanyaeger.api.Coordinate2D;

public class Ball extends Projectile {
    public Ball(boolean firedByPlayer) {
        super("sprites/Bomb.png", 5, 4, firedByPlayer, 1, 1);
    }
}
