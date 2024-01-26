import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Latar extends World
{
    private int jeda=0;
    private int score;
    private int nyawa = 3;
    private int time;
    private boolean level1 = true;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Latar()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 600, 1); 
        tampilnyawa();
        tampilscore();
        showTime();
        time= 1000;
        addObject (new Pesawat(),250,550);
        prepare();
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

    public void tampilnyawa()
    {
        showText("Nyawa :"+nyawa, 400, 25);
    }

    public void addScore (int points){
        score = score + points;
        tampilscore();
    }

    private void tampilscore()
    {
        showText ("Score :"+score, 100, 25);
    }

    private void countTime()
    {
        time--;
        showTime();

        if (time == 0)
        {
            if (level1) {
                pindahKeLevel2();
            } else {
                Greenfoot.stop();
                addObject(new Menang(),250,300);
            }
        }
    }
    
    private void pindahKeLevel2()
    {
        // Inisialisasi level 2
        Level2 level2 = new Level2();

        // Hapus semua objek dari level 1
        removeObjects(getObjects(null));
        
        showText("NAIK KE LEVEL 2", getWidth() / 2, getHeight() / 2);
        
        Greenfoot.delay(100);

        // Ganti World dengan level 2
        Greenfoot.setWorld(level2);

        // Setel variabel level1 menjadi false
        level1 = false;
    }

    private void showTime()
    {
        showText("Waktu :"+time,250,25);
    }

    public void act()
    {
        if (Greenfoot.getRandomNumber (100) < 3)
        {
            addObject(new Musuh(), Greenfoot.getRandomNumber(599), 500);
        }
        countTime();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
