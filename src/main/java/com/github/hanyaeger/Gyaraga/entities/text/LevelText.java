package com.github.hanyaeger.Gyaraga.entities.text;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class LevelText extends TextEntity {
    public LevelText(Coordinate2D initialLocation){
        super(initialLocation, "Level");

        setFont(Font.font("OCR A Extended", FontWeight.NORMAL, 30));
        setFill(Color.WHITE);
    }
}
