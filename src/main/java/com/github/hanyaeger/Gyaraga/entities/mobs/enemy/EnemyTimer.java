package com.github.hanyaeger.Gyaraga.entities.mobs.enemy;

import com.github.hanyaeger.Gyaraga.entities.mobs.enemy.enemies.Aegi;
import com.github.hanyaeger.api.Timer;

public class EnemyTimer extends Timer {
    Enemy enemy;

    public EnemyTimer(Enemy enemy) {
        super(500);
        this.enemy = enemy;
        isActive();
    }

    @Override
    public void onAnimationUpdate(long l) {
        if (enemy instanceof Aegi) {
            enemy.execAbility();
        } else {
            System.out.println("ENEMY SCHIEEEET");
            enemy.shootProjectile(enemy);
        }
    }
}
