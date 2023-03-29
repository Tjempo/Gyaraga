package com.github.hanyaeger.Gyaraga.entities.text;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class WinText extends TextEntity {
    public WinText(Coordinate2D initialLocation){
        super(initialLocation, "-~- YOU WON! -~-");

        setFont(Font.font("OCR A Extended", FontWeight.NORMAL, 60));
        setFill(Color.WHITE);
    }
}
