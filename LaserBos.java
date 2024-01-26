import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LaserBos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LaserBos extends Actor
{
    private int nyawa;
    
    public void gerak()
    {
        setLocation(getX(),getY()+5);
        if(getY()>590){
            getWorld().removeObject(this);
        }else{
            cek_kena();
        }
    }
    
    public void cek_kena(){
        if (isTouching(pesawat2.class))
        {
            getWorld().addObject(new Ledakan2(),getX(),getY());
            Level2 w= (Level2)getWorld();
            w.updatenyawa(-1);
            getWorld().removeObject(this);
            Greenfoot.playSound("meledak.mp3");
        }
    }
    
    public void act() 
    {
        gerak();
    }
}
