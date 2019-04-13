package com.example.funfacts;

import android.graphics.Color;

import java.util.Random;

public class ColorWheel {
    private static String[] colors = {"#39add1",
            "#3079ab",
            "#c25975",
            "#e15258",
            "#838cc7",
            "#51b46d",
            "#f092b0"};

    int setBackgroudColor(){
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(colors.length);
        int color = Color.parseColor(colors[randomNumber]);
        return color;
    }
}
