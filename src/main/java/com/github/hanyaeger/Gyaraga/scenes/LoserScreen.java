package com.github.hanyaeger.Gyaraga.scenes;

import com.github.hanyaeger.Gyaraga.Gyaraga;
import com.github.hanyaeger.Gyaraga.entities.buttons.QuitButton;
import com.github.hanyaeger.Gyaraga.entities.text.LoseText;
import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;

public class LoserScreen extends StaticScene {

    protected Gyaraga gyaraga;

    public LoserScreen(Gyaraga gyaraga) {
        this.gyaraga = gyaraga;
    }

    public void setupScene() {
        setBackgroundAudio("audio/spaceIntro.mp3");
        setBackgroundImage("backgrounds/background.gif");
    }

    @Override
    public void setupEntities() {
        var losetext = new LoseText(new Coordinate2D(getWidth() / 2, 300));
        losetext.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(losetext);

        var quitButton = new QuitButton
                (new Coordinate2D(10, getHeight() - 40), gyaraga);
        addEntity(quitButton);
    }
}
