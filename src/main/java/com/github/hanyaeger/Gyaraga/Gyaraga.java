package com.github.hanyaeger.Gyaraga;

import com.github.hanyaeger.Gyaraga.entities.mobs.Mob;
import com.github.hanyaeger.Gyaraga.entities.projectile.ProjectileType;
import com.github.hanyaeger.Gyaraga.scenes.*;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;



public class Gyaraga extends YaegerGame {
    public static void main(String[] args){
        launch(args);
    }

    public ProjectileType selectedWeapon = ProjectileType.LASER;
    public int selectedLevelMain = 1;


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
        addScene(3, new GameLevel2(this));
        addScene(4, new GameLevel3(this));
        addScene(5, new WinScreen(this));
        addScene(6, new LoserScreen(this));

    }
}
