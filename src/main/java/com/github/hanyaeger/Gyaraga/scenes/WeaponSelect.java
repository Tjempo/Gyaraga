package com.github.hanyaeger.Gyaraga.scenes;

import com.github.hanyaeger.Gyaraga.Gyaraga;
import com.github.hanyaeger.Gyaraga.entities.buttons.BackButton;
import com.github.hanyaeger.Gyaraga.entities.buttons.QuitButton;
import com.github.hanyaeger.Gyaraga.entities.buttons.StartButton;
import com.github.hanyaeger.Gyaraga.entities.buttons.WeaponButton;
import com.github.hanyaeger.Gyaraga.entities.mobs.Player;
import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;

public class WeaponSelect extends StaticScene {

    protected Gyaraga gyaraga;
    private final int aantalWapens = 3;

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
            var weaponButton = new WeaponButton
                    (new Coordinate2D(80 * (i + 1) + (75 * i), 400), gyaraga, Integer.toString(i + 1));
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
                (new Coordinate2D(getWidth() / 2, (getHeight() / 2) + 100), gyaraga);
        startButton.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(startButton);


    }

}

