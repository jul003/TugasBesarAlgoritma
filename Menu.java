import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 600, 1); 
        if(this.getClass().getName().equalsIgnoreCase("MenuUtama"))
        {
            TombolBantuan bantuan = new TombolBantuan();
            addObject(bantuan,361,510);
            TombolMulai mulai = new TombolMulai();
            addObject(mulai,141,510);
        }
        else
        {
            addObject (new TombolKembali(),61,61);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
    }
}
