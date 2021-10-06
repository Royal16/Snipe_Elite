package org.academiadecodigo;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;


public class UniverseKeyboardHandler implements KeyboardHandler {

    private Rectangle rectangle;
    private Rectangle slide;

    public UniverseKeyboardHandler(Rectangle rectangle, Rectangle slide){
        this.rectangle = rectangle;
        this.slide = slide;

        //keyboard is deaf
        Keyboard keyboard = new Keyboard(this);

        //create event
        KeyboardEvent left = new KeyboardEvent();
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        left.setKey(KeyboardEvent.KEY_LEFT);

        KeyboardEvent right = new KeyboardEvent();
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        right.setKey(KeyboardEvent.KEY_RIGHT);

        KeyboardEvent up = new KeyboardEvent();
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        up.setKey(KeyboardEvent.KEY_UP);

        KeyboardEvent down = new KeyboardEvent();
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        down.setKey(KeyboardEvent.KEY_DOWN);

        //keyboard listen to left
        keyboard.addEventListener(left);
        keyboard.addEventListener(right);
        keyboard.addEventListener(up);
        keyboard.addEventListener(down);
    }

    @Override
    public void keyPressed(KeyboardEvent e) {
        switch(e.getKey()){
            case KeyboardEvent.KEY_LEFT:
                if(rectangle.getX() - 50 < 0){
                    rectangle.translate(0, 0);
                }else{
                    rectangle.translate(-50, 0);
                }
                break;
            case KeyboardEvent.KEY_RIGHT:
                if((rectangle.getX() + 50) < (slide.getX())) {
                    rectangle.translate(50, 0);
                }else{
                    rectangle.translate(0, 0);
                }
                break;
            case KeyboardEvent.KEY_UP:
                System.out.println(rectangle.getHeight());
                if(rectangle.getY() - 50 < 0){
                    rectangle.translate(0, 0);
                }else {
                    rectangle.translate(0, -50);
                }
                break;
            case KeyboardEvent.KEY_DOWN:
                if((rectangle.getY() + 50) < (slide.getY())) {
                    rectangle.translate(0, 50);
                }else{
                    rectangle.translate(0, 0);
                }
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
