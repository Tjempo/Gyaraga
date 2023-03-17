package com.github.hanyaeger.Gyaraga.scenes;


import com.github.hanyaeger.Gyaraga.Gyaraga;
import com.github.hanyaeger.Gyaraga.entities.buttons.StartButton;
import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;

public class LevelSelect extends StaticScene {
    private Gyaraga gyaraga;

    public LevelSelect(Gyaraga gyaraga){
        this.gyaraga = gyaraga;
    }


    @Override
    public void setupScene(){
        setBackgroundAudio("audio/theme[Remix].mp3");
        setBackgroundImage("backgrounds/background.gif");
    }

    @Override
    public void setupEntities(){
        var startButton = new StartButton
                (new Coordinate2D(getWidth() / 2, (getHeight() / 2) + 100), gyaraga);
        startButton.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(startButton);
    }
}
