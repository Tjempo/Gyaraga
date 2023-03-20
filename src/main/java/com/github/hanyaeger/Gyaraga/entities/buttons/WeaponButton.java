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

public class WeaponButton extends TextEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener {
    private Gyaraga gyaraga;
    private int selectedWeapon;
    public int WeaponNumber;


    public WeaponButton(Coordinate2D initialLocation, Gyaraga gyaraga, String weaponNR) {
        super(initialLocation, weaponNR);
        WeaponNumber = Integer.parseInt(weaponNR);

        this.gyaraga = gyaraga;
        setFill(Color.WHITE);
        setFont(Font.font("Roboto", FontWeight.BOLD, 30));
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        switch (WeaponNumber) {
            case 1:
                System.out.println("Selected Weapon: Laser");
                selectedWeapon = 1;
                break;
            case 2:
                System.out.println("Selected Weapon: Shotgun");
                selectedWeapon = 2;
                break;
            case 3:
                System.out.println("Selected Weapon: Rocket");
                selectedWeapon = 3;
                break;
        }
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

    public int getSelectedWeapon() {
        return selectedWeapon;
    }
}

