package com.github.hanyaeger.Gyaraga;

import com.github.hanyaeger.Gyaraga.scenes.GameLevel1;
import com.github.hanyaeger.Gyaraga.scenes.WeaponSelect;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.Gyaraga.scenes.LevelSelect;



public class Gyaraga extends YaegerGame {
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void setupGame() {
        setGameTitle("Gyaraga");
        setSize(new Size(500, 800));
    }

    @Override
    public void setupScenes() {
        addScene(0, new LevelSelect(this));
        addScene(1, new WeaponSelect());
        addScene(2, new GameLevel1());
//        addScene(3, new GameLevel2());
//        addScene(4, new GameLevel3());
//        addScene(5, new GameLevel4());
//        addScene(5, new GameLevel4()); //Boss level
//        addScene(6, new EndScreen()); //End Screen
    }

}
