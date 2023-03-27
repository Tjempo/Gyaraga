package com.github.hanyaeger.Gyaraga.entities.mobs.enemy.enemies;

import com.github.hanyaeger.Gyaraga.entities.mobs.enemy.Enemy;
import com.github.hanyaeger.Gyaraga.entities.projectile.Projectile;
import com.github.hanyaeger.Gyaraga.entities.projectile.ProjectileType;
import com.github.hanyaeger.Gyaraga.entities.projectile.weapons.Explosion;
import com.github.hanyaeger.Gyaraga.entities.projectile.weapons.Laser;
import com.github.hanyaeger.api.Coordinate2D;

public class Bomber extends Enemy {
    public Bomber(Coordinate2D location) {
        super("sprites/bomber.png", location, ProjectileType.EXPLOSION);
        this.health = 20;
    }

    @Override
    public void execAbility() {

    }

    @Override
    public void execMovePattern() {

    }
}