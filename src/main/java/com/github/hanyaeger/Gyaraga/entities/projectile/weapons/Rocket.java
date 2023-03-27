package com.github.hanyaeger.Gyaraga.entities.projectile.weapons;

import com.github.hanyaeger.Gyaraga.entities.mobs.Mob;
import com.github.hanyaeger.Gyaraga.entities.mobs.Player;
import com.github.hanyaeger.Gyaraga.entities.mobs.enemy.Enemy;
import com.github.hanyaeger.Gyaraga.entities.projectile.Projectile;
import com.github.hanyaeger.Gyaraga.entities.projectile.ProjectileFactory;
import com.github.hanyaeger.Gyaraga.entities.projectile.ProjectileType;
import com.github.hanyaeger.Gyaraga.scenes.GameLevel1;
import com.github.hanyaeger.api.Coordinate2D;

public class Rocket extends Projectile {
    public Rocket(boolean firedByPlayer) {
        super("sprites/rocket.png", 0, 3, firedByPlayer, 1, 1);
    }

    @Override
    public void hitMob(Mob mob) {
        if ((firedByPlayer == true && mob instanceof Enemy) || (firedByPlayer == false && mob instanceof Player)) {
            Projectile bullet = ProjectileFactory.getProjectile(ProjectileType.EXPLOSION, firedByPlayer);
            GameLevel1.instance.addEntity(bullet);
            bullet.shoot(getLocationInScene());
            this.remove();
        }
    }
}
