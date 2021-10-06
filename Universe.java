package org.academiadecodigo;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Universe {
    public static void main(String[] args) throws InterruptedException {
        Rectangle rectangle = new Rectangle(0, 0, 50, 50);
        Rectangle slide = new Rectangle(0, 0, 2000, 1000);
        Rectangle barrier = new Rectangle(1000, 500, 10, 10);
        barrier.setColor(Color.WHITE);
        rectangle.setColor(Color.ORANGE);
        slide.setColor(Color.BLACK);
        slide.fill();
        rectangle.fill();
        barrier.fill();

        UniverseKeyboardHandler ukh = new UniverseKeyboardHandler(rectangle, barrier);

        
    }
}                                                                     