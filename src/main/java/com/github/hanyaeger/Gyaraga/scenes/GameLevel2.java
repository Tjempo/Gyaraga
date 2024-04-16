package com.github.hanyaeger.Gyaraga.scenes;

import com.github.hanyaeger.Gyaraga.Gyaraga;
import com.github.hanyaeger.Gyaraga.entities.mobs.Player;
import com.github.hanyaeger.Gyaraga.entities.mobs.enemy.enemies.Bomber;
import com.github.hanyaeger.Gyaraga.entities.mobs.enemy.enemies.Craig;
import com.github.hanyaeger.Gyaraga.entities.mobs.enemy.enemies.Dropper;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.YaegerEntity;

public class GameLevel2 extends GameLevel {
    public GameLevel2(Gyaraga gyaraga) {
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


        player = new Player
                (new Coordinate2D(getWidth() / 2, getHeight() - 100 ), gyaraga.selectedWeapon);
        enemies.add(new Dropper
                (new Coordinate2D((getWidth() / 8) * 1, (getHeight() / 21) * 4),
                        getRandomShootInterval(1000, 4000)));
        enemies.add(new Craig
                (new Coordinate2D((getWidth() / 8) * 2, (getHeight() / 21) * 11),
                        getRandomShootInterval(1000, 4000)));
        enemies.add(new Dropper
                (new Coordinate2D((getWidth() / 8) * 3, (getHeight() / 21) * 14),
                        getRandomShootInterval(1000, 4000)));
        enemies.add(new Craig
                (new Coordinate2D((getWidth() / 8) * 4, (getHeight() / 21) * 6),
                        getRandomShootInterval(1000, 4000)));
        enemies.add(new Dropper
                (new Coordinate2D((getWidth() / 8) * 5, (getHeight() / 21) * 2),
                        getRandomShootInterval(1000, 4000)));
        enemies.add(new Craig
                (new Coordinate2D((getWidth() / 8) * 6, (getHeight() / 21) * 9),
                        getRandomShootInterval(1000, 4000)));

        enemies.add(new Bomber
                (new Coordinate2D(((getWidth() / 2) + 10), (150)),
                        getRandomShootInterval(1000, 4000)));

        enemies.add(new Bomber
                (new Coordinate2D(((getWidth() / 2) - 50), (150)),
                        getRandomShootInterval(1000, 4000)));

        enemies.add(new Bomber
                (new Coordinate2D(((getWidth() / 2) - 150), (150)),
                        getRandomShootInterval(1000, 4000)));

        addEntity(player);

        for(int i = 0; i < enemies.size(); i++) {
            addEntity(enemies.get(i));
        }
    }
}