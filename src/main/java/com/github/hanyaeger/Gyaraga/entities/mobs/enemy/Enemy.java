package com.github.hanyaeger.Gyaraga.entities.mobs.enemy;

import com.github.hanyaeger.Gyaraga.entities.mobs.Mob;
import com.github.hanyaeger.Gyaraga.entities.projectile.Projectile;
import com.github.hanyaeger.api.Coordinate2D;

public abstract class Enemy extends Mob {
    public Enemy(String spriteDir, Coordinate2D location) {
        super(spriteDir, location);
        weapon.setDirection(180d);
    }

    public abstract void execAbility();

    public abstract void execMovePattern();
}
