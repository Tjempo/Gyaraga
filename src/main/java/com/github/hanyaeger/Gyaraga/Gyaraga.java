package com.github.hanyaeger.Gyaraga;

import com.github.hanyaeger.Gyaraga.entities.projectile.Projectile;
import com.github.hanyaeger.Gyaraga.entities.projectile.weapons.Laser;
import com.github.hanyaeger.Gyaraga.scenes.GameLevel1;
import com.github.hanyaeger.Gyaraga.scenes.LevelSelect;
import com.github.hanyaeger.Gyaraga.scenes.WeaponSelect;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;



public class Gyaraga extends YaegerGame {
    public static void main(String[] args){
        launch(args);
    }

    public Projectile selectedWeapon = new Laser(true);

    @Override
    public void setupGame() {
        setGameTitle("Gyaraga");
        setSize(new Size(500, 800));
    }

    @Override
    public void setupScenes() {
        addScene(0, new LevelSelect(this));
        addScene(1, new WeaponSelect(this));
        addScene(2, new GameLevel1(this));
//        addScene(3, new GameLevel2());
//        addScene(4, new GameLevel3());
//        addScene(5, new GameLevel4());
//        addScene(5, new GameLevel5()); //Boss level
//        addScene(6, new EndScreen()); //End Screen
    }

}
