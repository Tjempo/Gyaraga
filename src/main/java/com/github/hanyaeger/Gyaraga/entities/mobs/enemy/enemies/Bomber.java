package com.github.hanyaeger.Gyaraga.entities.mobs.enemy.enemies;

import com.github.hanyaeger.Gyaraga.entities.mobs.enemy.Enemy;
import com.github.hanyaeger.Gyaraga.entities.projectile.Projectile;
import com.github.hanyaeger.Gyaraga.entities.projectile.weapons.Laser;
import com.github.hanyaeger.api.Coordinate2D;

public class Bomber extends Enemy {
    public Bomber(String spriteDir, Coordinate2D location, int health, Projectile weapon) {
        super("sprites/bomber.png", location);
        this.health = 20;
        this.weapon = new Laser();
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