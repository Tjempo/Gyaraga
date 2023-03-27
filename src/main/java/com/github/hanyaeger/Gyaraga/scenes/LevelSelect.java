package com.github.hanyaeger.Gyaraga.scenes;


import com.github.hanyaeger.Gyaraga.Gyaraga;
import com.github.hanyaeger.Gyaraga.entities.buttons.LevelButton;
import com.github.hanyaeger.Gyaraga.entities.buttons.QuitButton;
import com.github.hanyaeger.Gyaraga.entities.buttons.StartButton;
import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;

public class LevelSelect extends StaticScene {
    private Gyaraga gyaraga;
    private static final int aantalLevels = 5;

    public LevelSelect(Gyaraga gyaraga){
        this.gyaraga = gyaraga;
    }


    @Override
    public void setupScene(){
        setBackgroundAudio("audio/spaceIntro.mp3");
        setBackgroundImage("backgrounds/background.gif");
    }

    @Override
    public void setupEntities(){

        for(int i = 0; i < aantalLevels; i++) {
            var levelButton = new LevelButton
                    (new Coordinate2D(30 * (i + 1) + (75 * i), 400), gyaraga, Integer.toString(i + 1));
            levelButton.setAnchorPoint(AnchorPoint.CENTER_CENTER);
            addEntity(levelButton);
        }

        var quitButton = new QuitButton
                (new Coordinate2D(10, getHeight() - 40), gyaraga);
        addEntity(quitButton);
    }
}
