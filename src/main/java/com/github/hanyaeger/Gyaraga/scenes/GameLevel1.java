package com.github.hanyaeger.Gyaraga.scenes;

import com.github.hanyaeger.Gyaraga.Gyaraga;
import com.github.hanyaeger.Gyaraga.entities.buttons.QuitButton;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;

public class GameLevel1 extends DynamicScene {
    private Gyaraga gyaraga;

    @Override
    public void setupScene(){

        setBackgroundAudio("audio/theme[Remix].mp3");
        setBackgroundImage("backgrounds/background.gif");
    }
    @Override
    public void setupEntities(){

        var quitButton = new QuitButton
                (new Coordinate2D(10, getHeight() - 40), gyaraga);
        addEntity(quitButton);

    }
}
