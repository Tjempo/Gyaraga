package com.github.hanyaeger.Gyaraga.entities.mobs.enemy.enemies;

import com.github.hanyaeger.Gyaraga.entities.mobs.enemy.Enemy;
import com.github.hanyaeger.Gyaraga.entities.projectile.Projectile;
import com.github.hanyaeger.Gyaraga.entities.projectile.ProjectileType;
import com.github.hanyaeger.Gyaraga.entities.projectile.weapons.Explosion;
import com.github.hanyaeger.Gyaraga.entities.projectile.weapons.Laser;
import com.github.hanyaeger.Gyaraga.scenes.GameLevel;
import com.github.hanyaeger.api.Coordinate2D;

public class Bomber extends Enemy {
    public Bomber(Coordinate2D location, int shootInterval) {
        super("sprites/bomber.png", location, ProjectileType.SHELL, shootInterval);
        this.health = 50;
    }

    @Override
    public void execAbility() {
        Explosion bomberExplosion = new Explosion(true);
        bomberExplosion.setAnchorLocation(new Coordinate2D(getLocationInScene().getX() - 24, getLocationInScene().getY() - 24));
        GameLevel.instance.addEntity(bomberExplosion);
    }
}