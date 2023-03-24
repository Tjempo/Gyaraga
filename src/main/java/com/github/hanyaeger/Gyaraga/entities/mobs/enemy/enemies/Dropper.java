package com.github.hanyaeger.Gyaraga.entities.mobs.enemy.enemies;

import com.github.hanyaeger.Gyaraga.entities.mobs.enemy.Enemy;
import com.github.hanyaeger.Gyaraga.entities.projectile.Projectile;
import com.github.hanyaeger.Gyaraga.entities.projectile.weapons.Ball;
import com.github.hanyaeger.Gyaraga.entities.projectile.weapons.Laser;
import com.github.hanyaeger.api.Coordinate2D;

public class Dropper extends Enemy {
    public Dropper(String spriteDir, Coordinate2D location, int health) {
        super("sprites/dropper.png", location, new Ball(false));
        this.health = 20;
        weapon.setDirection(180d);
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
