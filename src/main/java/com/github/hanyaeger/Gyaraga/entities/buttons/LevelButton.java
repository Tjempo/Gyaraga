package com.github.hanyaeger.Gyaraga.entities.buttons;

import com.github.hanyaeger.Gyaraga.Gyaraga;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseEnterListener;
import com.github.hanyaeger.api.userinput.MouseExitListener;
import javafx.scene.Cursor;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class LevelButton extends TextEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener {

    private Gyaraga gyaraga;
    public String Slev;
    public int NLev;
    public int levelNumber;


    public LevelButton(Coordinate2D initialLocation, Gyaraga gyaraga, String levelNR){
        super(initialLocation,levelNR);
        Slev = levelNR;
        NLev = Integer.parseInt(levelNR);

        this.gyaraga = gyaraga;
        setFill(Color.WHITE);
        setFont(Font.font("OCR A Extended", FontWeight.BOLD, 30));
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        switch (NLev) {
            case 1 -> {
                System.out.println("Level 1");
                levelNumber = 1;
                goToWeaponSelect();
            }
            case 2 -> {
                System.out.println("Level 2");
                levelNumber = 4;
                goToWeaponSelect();
            }
            case 3 -> {
                System.out.println("Level 3");
                levelNumber = 3;
                goToWeaponSelect();
            }
            case 4 -> {
                System.out.println("Level 4");
                levelNumber = 4;
                goToWeaponSelect();
            }
            case 5 -> {
                System.out.println("Level 5");
                levelNumber = 5;
                goToWeaponSelect();
            }
        }
    }

    private void goToWeaponSelect() {
        gyaraga.setActiveScene(1);
    }

    @Override
    public void onMouseEntered(){
        setFill(Color.WHITESMOKE);
        setCursor(Cursor.HAND);
    }

    @Override
    public void onMouseExited(){
        setFill(Color.WHITE);
        setCursor(Cursor.DEFAULT);
    }

    public int getLevelNumber() {
        return levelNumber;
    }
}
