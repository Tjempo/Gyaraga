package com.github.hanyaeger.Gyaraga.scenes;

import com.github.hanyaeger.Gyaraga.Gyaraga;
import com.github.hanyaeger.Gyaraga.entities.buttons.QuitButton;
import com.github.hanyaeger.Gyaraga.entities.text.WinText;
import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;

public class WinScreen extends StaticScene {

    protected Gyaraga gyaraga;

    public WinScreen(Gyaraga gyaraga) {
        this.gyaraga = gyaraga;
    }

    public void setupScene() {
        setBackgroundAudio("audio/spaceIntro.mp3");
        setBackgroundImage("backgrounds/background.gif");
    }

    @Override
    public void setupEntities() {
        var wintext = new WinText(new Coordinate2D(getWidth() / 2, 300));
        wintext.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(wintext);

        var quitButton = new QuitButton
                (new Coordinate2D(10, getHeight() - 40), gyaraga);
        addEntity(quitButton);
    }
}
