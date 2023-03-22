package com.github.hanyaeger.Gyaraga.scenes;

import com.github.hanyaeger.Gyaraga.Gyaraga;
import com.github.hanyaeger.Gyaraga.entities.buttons.BackButton;
import com.github.hanyaeger.Gyaraga.entities.buttons.QuitButton;
import com.github.hanyaeger.Gyaraga.entities.buttons.WeaponButton;
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
                    (new Coordinate2D(50 * (i + 1) + (100 * i), 400), gyaraga, Integer.toString(i + 1));
            weaponButton.setAnchorPoint(AnchorPoint.CENTER_CENTER);
            addEntity(weaponButton);
        }

        var quitButton = new QuitButton
                (new Coordinate2D(10, getHeight() - 40), gyaraga);
        addEntity(quitButton);

        var backButton = new BackButton
                (new Coordinate2D(getWidth() - 80, getHeight() - 40), gyaraga);
        addEntity(backButton);
    }
}

