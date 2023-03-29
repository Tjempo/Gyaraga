package com.github.hanyaeger.Gyaraga.scenes;


import com.github.hanyaeger.Gyaraga.Gyaraga;
import com.github.hanyaeger.Gyaraga.entities.buttons.LevelButton;
import com.github.hanyaeger.Gyaraga.entities.buttons.QuitButton;
import com.github.hanyaeger.Gyaraga.entities.text.LevelText;
import com.github.hanyaeger.Gyaraga.entities.text.TitleText;
import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;

public class LevelSelect extends StaticScene {
    private Gyaraga gyaraga;
    private static final int aantalLevels = 3;

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
                    (new Coordinate2D(80 * (i + 1) + (75 * i), 400), gyaraga, Integer.toString(i + 1));
            levelButton.setAnchorPoint(AnchorPoint.CENTER_CENTER);
            addEntity(levelButton);
        }

        var quitButton = new QuitButton
                (new Coordinate2D(10, getHeight() - 40), gyaraga);
        addEntity(quitButton);

        var levelText = new LevelText
                (new Coordinate2D(getWidth() / 2, 325));
        levelText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(levelText);

        var titelText = new TitleText
                (new Coordinate2D(getWidth() / 2, 175));
        titelText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(titelText);
    }


}
