import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class missiles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class missiles extends Actor {
    

    public void gerak() {
        setLocation(getX(), getY() - 5);
        if (getY() < 10) {
            getWorld().removeObject(this);
        } else {
            benang();
        }
    }

    public void benang() {
        if (isTouching(Boss.class)) {
            getWorld().addObject(new Ledakan1(), getX(), getY());
            Level2 level = (Level2) getWorld();
            Greenfoot.playSound("explosion.wav");
            removeTouching(Boss.class);
            
        }
    }

    

    public void act() {
        gerak();
    }
}