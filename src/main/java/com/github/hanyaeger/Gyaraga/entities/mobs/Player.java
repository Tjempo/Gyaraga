package com.github.hanyaeger.Gyaraga.entities.mobs;

import com.github.hanyaeger.Gyaraga.entities.projectile.Projectile;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;

public class Player extends Mob{
    public Player(String spriteDir, Coordinate2D location, int health, Projectile weapon) {
        super("sprites/spaceship.png", location, health, weapon);
    }

    @Override
    public void shootProjectile() {
        Projectile shot = weapon;
    }
}
