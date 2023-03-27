package com.github.hanyaeger.Gyaraga.entities.projectile.weapons;

import com.github.hanyaeger.Gyaraga.entities.mobs.Mob;
import com.github.hanyaeger.Gyaraga.entities.projectile.Projectile;
import com.github.hanyaeger.api.Coordinate2D;

public class Shell extends Projectile {
    public int number;

    public Shell(boolean firedByPlayer, int number) {
        super("sprites/shell.png", 5, 5, firedByPlayer, 1, 1);
        this.number = number;
    }
}
