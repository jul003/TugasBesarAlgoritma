import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    private int jeda=0;
    private int score;
    private int nyawa = 2;
    private int time;
    
    
    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 600, 1); 
        prepare();
        tampilnyawa();
        
        showTime();
        time= 1000;
        addObject (new pesawat2(),250,550);
    }
    
    
    private void prepare()
    {
        addObject(new Boss(), 250, 100); // Menambahkan bos ke level 2 pada posisi tertentu
    }
    
    public void tampilnyawa()
    {
        showText("Nyawa :"+nyawa, 400, 25);
    }
    
    public void updatenyawa(int point)
    {
        nyawa = nyawa + point;
        tampilnyawa();

        if(nyawa ==0)
        {
            Greenfoot.stop();
            addObject(new kalah(),250,300);
        }
    }
    
    
    
    private void showTime()
    {
        showText("Waktu :"+time,250,25);
    }
    
    private void countTime()
    {
        time--;
        showTime();
        if (time == 0)
        {
            Greenfoot.stop();
            addObject(new Menang(),250,300);
        }
    
    }
    
    public void act()
    {
        if (Greenfoot.getRandomNumber (100) < 3)
        {
            addObject(new Boss(), Greenfoot.getRandomNumber(599), 500);
        }
        countTime();
    }
}
