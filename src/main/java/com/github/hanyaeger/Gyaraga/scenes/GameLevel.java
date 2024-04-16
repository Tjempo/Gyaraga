package com.github.hanyaeger.Gyaraga.scenes;

import com.github.hanyaeger.Gyaraga.Gyaraga;
import com.github.hanyaeger.Gyaraga.entities.mobs.Player;
import com.github.hanyaeger.Gyaraga.entities.mobs.enemy.Enemy;
import com.github.hanyaeger.api.TimerContainer;
import com.github.hanyaeger.api.entities.YaegerEntity;
import com.github.hanyaeger.api.scenes.DynamicScene;

import java.util.ArrayList;
import java.util.Random;

public class GameLevel extends DynamicScene implements TimerContainer {
    protected Gyaraga gyaraga;
    public static GameLevel instance;


    public Player player;
    public ArrayList<Enemy> enemies = new ArrayList<Enemy>();

    LevelTimer levelTimer = new LevelTimer(this);

    public GameLevel(Gyaraga gyaraga) {
        this.gyaraga = gyaraga;
    }

    @Override
    public void setupTimers() {
        addTimer(levelTimer);
    }

    @Override
    public void addEntity(YaegerEntity entity) {super.addEntity(entity);}

    @Override
    public void setupScene(){
        setBackgroundAudio("audio/theme[Remix].mp3");
        setBackgroundImage("backgrounds/background.gif");
    }
    @Override
    public void setupEntities(){
        //
    }

    public int getRandomShootInterval(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}