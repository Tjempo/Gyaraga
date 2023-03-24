package com.github.hanyaeger.Gyaraga.entities.mobs.enemy;

import com.github.hanyaeger.Gyaraga.entities.mobs.Mob;
import com.github.hanyaeger.Gyaraga.entities.projectile.Projectile;
import com.github.hanyaeger.api.Coordinate2D;

public abstract class Enemy extends Mob {
    public Enemy(String spriteDir, Coordinate2D location, Projectile weapon) {
        super(spriteDir, location, weapon);
        weapon.setDirection(0d);
    }

    public abstract void execAbility();

    public abstract void execMovePattern();
}
