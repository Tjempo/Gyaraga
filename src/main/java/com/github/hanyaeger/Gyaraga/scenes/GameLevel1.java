package com.github.hanyaeger.Gyaraga.scenes;

import com.github.hanyaeger.Gyaraga.Gyaraga;
import com.github.hanyaeger.Gyaraga.entities.buttons.WeaponButton;
import com.github.hanyaeger.Gyaraga.entities.mobs.Player;
import com.github.hanyaeger.Gyaraga.entities.mobs.enemy.enemies.Craig;
import com.github.hanyaeger.Gyaraga.entities.projectile.Projectile;
import com.github.hanyaeger.Gyaraga.entities.text.HealthText;
import com.github.hanyaeger.Gyaraga.entities.text.ScoreText;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;

public class GameLevel1 extends DynamicScene{
    private Gyaraga gyaraga;
    private Projectile playerWeapon;

    public GameLevel1(Gyaraga gyaraga) {
        this.gyaraga = gyaraga;
        this.playerWeapon = gyaraga.selectedWeapon;
    }

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

        System.out.println(playerWeapon);
        var player = new Player(new Coordinate2D(getWidth() / 2, getHeight() - 100 ), playerWeapon);
        addEntity(player);

        var craig = new Craig(new Coordinate2D(getWidth() / 2, getHeight() / 2 + 100));
        addEntity(craig);
    }
}