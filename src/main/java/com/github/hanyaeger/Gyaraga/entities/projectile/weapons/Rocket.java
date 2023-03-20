package com.github.hanyaeger.Gyaraga.entities.projectile.weapons;

import com.github.hanyaeger.Gyaraga.entities.mobs.Mob;
import com.github.hanyaeger.Gyaraga.entities.projectile.Projectile;
import com.github.hanyaeger.api.Coordinate2D;

public class Rocket extends Projectile {
    public Rocket(Coordinate2D location) {
        super("", location, 0);
    }

    @Override
    public void hitMob(Mob mob) {
        super.hitMob(mob);
        Explosion explosion = new Explosion(location);
    }
}
