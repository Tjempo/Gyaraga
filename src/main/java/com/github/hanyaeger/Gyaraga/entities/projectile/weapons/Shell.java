package com.github.hanyaeger.Gyaraga.entities.projectile.weapons;

import com.github.hanyaeger.Gyaraga.entities.mobs.Mob;
import com.github.hanyaeger.Gyaraga.entities.projectile.Projectile;
import com.github.hanyaeger.api.Coordinate2D;

public class Shell extends Projectile {
    public Shell(Coordinate2D location) {
        super("", location, 5);
    }
}
