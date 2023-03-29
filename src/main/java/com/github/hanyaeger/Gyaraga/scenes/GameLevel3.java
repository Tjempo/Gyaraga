package com.github.hanyaeger.Gyaraga.scenes;

import com.github.hanyaeger.Gyaraga.Gyaraga;
import com.github.hanyaeger.Gyaraga.entities.mobs.Player;
import com.github.hanyaeger.Gyaraga.entities.mobs.enemy.enemies.Aegi;
import com.github.hanyaeger.Gyaraga.entities.mobs.enemy.enemies.Bomber;
import com.github.hanyaeger.Gyaraga.entities.mobs.enemy.enemies.Craig;
import com.github.hanyaeger.Gyaraga.entities.mobs.enemy.enemies.Dropper;
import com.github.hanyaeger.Gyaraga.entities.text.HealthText;
import com.github.hanyaeger.Gyaraga.entities.text.ScoreText;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.YaegerEntity;

import java.net.CacheRequest;

public class GameLevel3 extends GameLevel {
    public GameLevel3(Gyaraga gyaraga) {
        super(gyaraga);
        //instance = this;
    }

    @Override
    public void addEntity(YaegerEntity entity) {super.addEntity(entity);}

    @Override
    public void setupScene(){
        super.setupScene();
        instance = this;
    }

    @Override
    public void setupEntities(){
        var healthText = new HealthText(new Coordinate2D(20,20));
        addEntity(healthText);

        var scoreText = new ScoreText
                (new Coordinate2D(10, getHeight() - 80));
        addEntity(scoreText);

        player = new Player
                (new Coordinate2D(getWidth() / 2, getHeight() - 100 ), gyaraga.selectedWeapon);
        enemies.add(new Aegi
                (new Coordinate2D((getWidth() - (75 * 1) - 50), (400)),
                        getRandomShootInterval(1000, 10000)));
        enemies.add(new Aegi
                (new Coordinate2D((getWidth() - (75 * 2) - 50), (400)),
                        getRandomShootInterval(1000, 10000)));
        enemies.add(new Aegi
                (new Coordinate2D((getWidth() - (75 * 3) - 50), (400)),
                        getRandomShootInterval(1000, 10000)));
        enemies.add(new Aegi
                (new Coordinate2D((getWidth() - (75 * 4) - 50), (400)),
                        getRandomShootInterval(1000, 10000)));
        enemies.add(new Aegi
                (new Coordinate2D((getWidth() - (75 * 5) - 50), (400)),
                        getRandomShootInterval(1000, 4000)));

        //Droppers

        enemies.add(new Dropper
                (new Coordinate2D((getWidth() - (110 * 1) - 50), (300)),
                        getRandomShootInterval(1000, 4000)));
        enemies.add(new Dropper
                (new Coordinate2D((getWidth() - (110 * 2) - 50), (300)),
                        getRandomShootInterval(1000, 4000)));
        enemies.add(new Dropper
                (new Coordinate2D((getWidth() - (110 * 3)- 50), (300)),
                        getRandomShootInterval(1000, 4000)));

        enemies.add(new Bomber
                (new Coordinate2D(((getWidth() / 2) - 50), (150)),
                getRandomShootInterval(1000, 4000)));

        enemies.add(new Craig
                (new Coordinate2D(((getWidth() / 2)), (150)),
                        getRandomShootInterval(1000, 4000)));
        enemies.add(new Craig
                (new Coordinate2D(((getWidth() / 2) - 100), (150)),
                        getRandomShootInterval(1000, 4000)));

        addEntity(player);

        for(int i = 0; i < enemies.size(); i++) {
            addEntity(enemies.get(i));
        }
    }
}