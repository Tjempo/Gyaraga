package com.github.hanyaeger.Gyaraga.scenes;

import com.github.hanyaeger.Gyaraga.entities.mobs.enemy.Enemy;
import com.github.hanyaeger.api.Timer;

import java.util.ConcurrentModificationException;

public class LevelTimer extends Timer {
    GameLevel gameLevel;

    public LevelTimer(GameLevel gameLevel) {
        super(10);
        this.gameLevel = gameLevel;
        isActive();
    }

    @Override
    public void onAnimationUpdate(long l) {
        try {
            if (gameLevel.player.health < 1) {
                gameLevel.gyaraga.setActiveScene(6);
            }
            for (Enemy e : gameLevel.enemies) {
                if (e.health < 1) {
                    gameLevel.enemies.remove(e);
                }
            }
            if (gameLevel.enemies.isEmpty()) {
                gameLevel.gyaraga.setActiveScene(5);
            }
        }
        catch(ConcurrentModificationException e) {
            System.out.println("Verwachte error: ConcurrentModificiatonException: spel crasht niet");
        }
    }
}
