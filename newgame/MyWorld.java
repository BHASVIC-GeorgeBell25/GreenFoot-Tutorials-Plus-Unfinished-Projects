import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    private void prepare()
    {
        soldier soldier = new soldier();
        addObject(soldier,69,76);
        soldier soldier2 = new soldier();
        addObject(soldier2,69,163);
        soldier soldier3 = new soldier();
        addObject(soldier3,69,256);
        soldier soldier4 = new soldier();
        addObject(soldier4,69,345);
        evil evil = new evil();
        addObject(evil,526,76);
        evil evil2 = new evil();
        addObject(evil2,526,163);
        evil evil3 = new evil();
        addObject(evil3,526,256);
        evil evil4 = new evil();
        addObject(evil4,526,345);
        statusboard status = new statusboard();
        status.setValues(0);
        addObject(status,50,90);
    }
}
