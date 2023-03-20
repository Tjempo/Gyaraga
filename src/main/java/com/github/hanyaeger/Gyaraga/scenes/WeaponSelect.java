package com.github.hanyaeger.Gyaraga.scenes;

import com.github.hanyaeger.Gyaraga.Gyaraga;
import com.github.hanyaeger.Gyaraga.entities.buttons.QuitButton;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;

public class WeaponSelect extends StaticScene {

    private Gyaraga gyaraga;

    public void setupScene(){
        setBackgroundAudio("audio/spaceIntro.mp3");
        setBackgroundImage("backgrounds/background.gif");
    }

    @Override
    public void setupEntities(){

        var quitButton = new QuitButton
                (new Coordinate2D(10, getHeight() - 40), gyaraga);
        addEntity(quitButton);
    }
}

