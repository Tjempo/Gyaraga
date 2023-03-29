package com.github.hanyaeger.Gyaraga.entities.mobs.enemy;

import com.github.hanyaeger.Gyaraga.entities.mobs.Mob;
import com.github.hanyaeger.Gyaraga.entities.projectile.Projectile;
import com.github.hanyaeger.Gyaraga.entities.projectile.ProjectileType;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.TimerContainer;

public abstract class Enemy extends Mob implements TimerContainer {
    protected EnemyTimer enemyTimer;

    public Enemy(String spriteDir, Coordinate2D location, ProjectileType weapon, int shootInterval) {
        super(spriteDir, location, weapon);
        enemyTimer = new EnemyTimer(this);
        enemyTimer.setIntervalInMs(shootInterval);
        setupTimers();
    }

    @Override
    public void setupTimers() {
        addTimer(enemyTimer);
    }

    public abstract void execAbility();
}
