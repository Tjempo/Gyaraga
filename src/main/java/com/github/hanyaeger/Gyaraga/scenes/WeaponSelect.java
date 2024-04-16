package com.github.hanyaeger.Gyaraga.scenes;

import com.github.hanyaeger.Gyaraga.Gyaraga;
import com.github.hanyaeger.Gyaraga.entities.buttons.BackButton;
import com.github.hanyaeger.Gyaraga.entities.buttons.QuitButton;
import com.github.hanyaeger.Gyaraga.entities.buttons.StartButton;
import com.github.hanyaeger.Gyaraga.entities.buttons.WeaponButton;
import com.github.hanyaeger.Gyaraga.entities.mobs.LaserGun;
import com.github.hanyaeger.Gyaraga.entities.mobs.RocketGun;
import com.github.hanyaeger.Gyaraga.entities.mobs.ShotgunGun;
import com.github.hanyaeger.Gyaraga.entities.text.WeaponText;
import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;

public class WeaponSelect extends StaticScene {

    protected Gyaraga gyaraga;
    private final int aantalWapens = 3;
    String weaponName;

    public WeaponSelect(Gyaraga gyaraga){
        this.gyaraga = gyaraga;

    }

    public void setupScene(){
        setBackgroundAudio("audio/spaceIntro.mp3");
        setBackgroundImage("backgrounds/background.gif");
    }

    @Override
    public void setupEntities(){
        for(int i = 0; i < aantalWapens; i++) {
        if(i == 0){
            weaponName = "Laser";
        }else if (i == 1){
            weaponName = "Shotgun";
        }else if (i == 2){
            weaponName = "Rocket";
        }
            var weaponButton = new WeaponButton
                    (new Coordinate2D(80 * (i + 1) + (75 * i), 500), gyaraga, Integer.toString(i + 1),weaponName);
            weaponButton.setAnchorPoint(AnchorPoint.CENTER_CENTER);
            addEntity(weaponButton);
             if(i == 0){

            }else if(i == 1){

            }else if(i == 2){

            }
        }

        var quitButton = new QuitButton
                (new Coordinate2D(10, getHeight() - 40), gyaraga);
        addEntity(quitButton);

        var backButton = new BackButton
                (new Coordinate2D(getWidth() - 80, getHeight() - 40), gyaraga);
        addEntity(backButton);

        var startButton = new StartButton
                (new Coordinate2D(getWidth() / 2, (getHeight() / 2) + 200), gyaraga);
        startButton.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(startButton);

        var laserGun = new LaserGun(new Coordinate2D(50,375), null);
        addEntity(laserGun);
        var shotgunn = new ShotgunGun(new Coordinate2D(200,375), null);
        addEntity(shotgunn);
        var rocketwapen = new RocketGun(new Coordinate2D(350,375), null);
        addEntity(rocketwapen);


        var weaponText = new WeaponText(new Coordinate2D(getWidth() / 2, 275));
        weaponText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(weaponText);


    }
}

