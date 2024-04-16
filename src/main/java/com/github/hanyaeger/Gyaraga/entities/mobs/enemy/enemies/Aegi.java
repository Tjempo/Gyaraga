package com.github.hanyaeger.Gyaraga.entities.mobs.enemy.enemies;

import com.github.hanyaeger.Gyaraga.entities.mobs.Mob;
import com.github.hanyaeger.Gyaraga.entities.mobs.enemy.Enemy;
import com.github.hanyaeger.Gyaraga.entities.projectile.Projectile;
import com.github.hanyaeger.Gyaraga.entities.projectile.ProjectileType;
import com.github.hanyaeger.Gyaraga.entities.projectile.weapons.Laser;
import com.github.hanyaeger.Gyaraga.scenes.GameLevel;
import com.github.hanyaeger.api.Coordinate2D;

public class Aegi extends Enemy {
    public Aegi(Coordinate2D location, int shootInterval) {
        super("sprites/aegi.png", location, ProjectileType.LASER, shootInterval);
        this.health = 100;
    }

    @Override
    public void execAbility() {
        Shield aegiShield = new Shield(new Coordinate2D(getLocationInScene().getX() - 12, getLocationInScene().getY() - 12), 999999999);
        GameLevel.instance.addEntity(aegiShield);
    }
}
