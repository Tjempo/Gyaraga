package com.github.hanyaeger.Gyaraga.scenes;

import com.github.hanyaeger.Gyaraga.Gyaraga;
import com.github.hanyaeger.Gyaraga.entities.buttons.WeaponButton;
import com.github.hanyaeger.Gyaraga.entities.mobs.Player;
import com.github.hanyaeger.Gyaraga.entities.mobs.enemy.enemies.Aegi;
import com.github.hanyaeger.Gyaraga.entities.mobs.enemy.enemies.Bomber;
import com.github.hanyaeger.Gyaraga.entities.mobs.enemy.enemies.Craig;
import com.github.hanyaeger.Gyaraga.entities.mobs.enemy.enemies.Dropper;
import com.github.hanyaeger.Gyaraga.entities.projectile.Projectile;
import com.github.hanyaeger.Gyaraga.entities.text.HealthText;
import com.github.hanyaeger.Gyaraga.entities.text.ScoreText;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.YaegerEntity;
import com.github.hanyaeger.api.scenes.DynamicScene;

public class GameLevel1 extends DynamicScene{
    private Gyaraga gyaraga;
    public static GameLevel1 instance;

    public GameLevel1(Gyaraga gyaraga) {
        this.gyaraga = gyaraga;
        instance = this;
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

        var healthText = new HealthText(new Coordinate2D(10,10));
        addEntity(healthText);

        var scoreText = new ScoreText
                (new Coordinate2D(10, getHeight() - 80));
        addEntity(scoreText);

        System.out.println(gyaraga.selectedWeapon);
        var player = new Player
                (new Coordinate2D(getWidth() / 2, getHeight() - 100 ), gyaraga.selectedWeapon);
        addEntity(player);

        var craig = new Craig
                (new Coordinate2D(getWidth() / 2, getHeight() / 2 + 100));
        addEntity(craig);

        var bomber = new Bomber
                (new Coordinate2D(getWidth() / 3, getHeight() / 2));
        addEntity(bomber);

        var aegi = new Aegi
                (new Coordinate2D(getWidth() / 4, getHeight() / 2 - 100));
        addEntity(aegi);

        var dropper = new Dropper
                (new Coordinate2D(getWidth() / 2, getHeight() / 2 - 200));
        addEntity(dropper);
    }
}