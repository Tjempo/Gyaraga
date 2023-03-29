package com.github.hanyaeger.Gyaraga.entities.mobs.enemy.enemies;

import com.github.hanyaeger.Gyaraga.entities.mobs.enemy.Enemy;
import com.github.hanyaeger.Gyaraga.entities.projectile.Projectile;
import com.github.hanyaeger.Gyaraga.entities.projectile.ProjectileType;
import com.github.hanyaeger.Gyaraga.entities.projectile.weapons.Laser;
import com.github.hanyaeger.api.Coordinate2D;

public class Shield extends Enemy {
    public Shield(Coordinate2D location, int shootInterval) {
        super("sprites/shield.png", location, ProjectileType.LASER, shootInterval);
        this.health = 200;
    }

    @Override
    public void execAbility() {
        //nothing
    }
}