package com.github.hanyaeger.Gyaraga.entities.mobs.enemy.enemies;

import com.github.hanyaeger.Gyaraga.entities.mobs.enemy.Enemy;
import com.github.hanyaeger.Gyaraga.entities.projectile.Projectile;
import com.github.hanyaeger.Gyaraga.entities.projectile.weapons.Laser;
import com.github.hanyaeger.api.Coordinate2D;

public class Shield extends Enemy {
    public Shield(String spriteDir, Coordinate2D location, int health) {
        super("sprites/shield.png", location, null);
        this.health = 20;
    }

    @Override
    public void execAbility() {

    }

    @Override
    public void execMovePattern() {

    }

    @Override
    public void shootProjectile() {

    }
}