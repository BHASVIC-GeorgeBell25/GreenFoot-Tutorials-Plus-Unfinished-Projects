import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int time = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        bigblue bigblue = new bigblue();
        addObject(bigblue,150,375);
        platform platform1 = new platform();
        addObject(platform1,533,245);
        platform platform2 = new platform();
        addObject(platform2,337,377);
    }

    public void act(){
        time=time+1;
        //if (time == 1){
        //    platform platform1 = new platform();
        //    addObject(platform1,600,400);
        //}
        //if (time == 30){
        //    platform platform2 = new platform();
        //    addObject(platform2,400,200);
        //}
        //if (time == 70){
        //    platform platform3 = new platform();
        //    addObject(platform3,200,0);
        //}
    }
}
