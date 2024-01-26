import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Actor
{
    public int tahan = 30;
    private int jeda = 0;
    
    public void gerak()
    {
        setLocation(getX(), getY() + 5); 
        if (getY() > 500) {
            setLocation(Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(50));
        }
    }
    
    public void act() 
    {
        gerak();
        if (tahan == 0) {
            tahan = 30;
        }
        if (jeda > 0) {
            jeda--;
        }
        if (jeda == 1) {
            getWorld().addObject(new LaserBos(), getX(), getY() + 200);
        }
        if (jeda == 0) {
            jeda = 100;
        }
    }
    
    
     
}
