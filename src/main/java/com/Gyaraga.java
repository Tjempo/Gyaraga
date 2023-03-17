package com.github.hanyaeger.Gyaraga;
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
//        addScene(1, new GameLevel());
//        addScene(2, new EndScreen(this));
    }

}
