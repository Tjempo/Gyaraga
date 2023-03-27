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

public class QuitButton extends TextEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener {

    private Gyaraga gyaraga;

    public QuitButton(Coordinate2D initialLocation, Gyaraga gyaraga){
        super(initialLocation,"Quit");
        this.gyaraga = gyaraga;
        setFill(Color.GRAY);
        setFont(Font.font("OCR A Extended", FontWeight.BOLD, 30));
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        gyaraga.quit();
    }
    @Override
    public void onMouseEntered(){
        setFill(Color.WHITESMOKE);
        setCursor(Cursor.HAND);
    }

    @Override
    public void onMouseExited(){
        setFill(Color.GRAY);
        setCursor(Cursor.DEFAULT);
    }
}
