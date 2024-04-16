package com.github.hanyaeger.Gyaraga.entities.text;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class TitleText extends TextEntity {
    public TitleText(Coordinate2D initialLocation){
        super(initialLocation, "Gyaraga");

        setFont(Font.font("LUICIDA CONSOLE", FontWeight.NORMAL, 55));
        setFill(Color.WHITE);
    }
}
