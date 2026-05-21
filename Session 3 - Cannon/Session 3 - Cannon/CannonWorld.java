import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CannonWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CannonWorld extends World
{
    public CannonWorld()
    {    
        super(600, 400, 1);
        prepare();
    } 
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        statusboard status = new statusboard();
        status.setValues(0,100);
        addObject(status,50,90);
        
        turret turret1 = new turret(status);
        addObject(turret1,20 + Greenfoot.getRandomNumber(200),380);
        
        addObject(new target(), 340 + Greenfoot.getRandomNumber(230),375);
        
        addObject(new brickwall(),285,380);
        int height = Greenfoot.getRandomNumber(5) + 1;
        
        for (int index = 0; index<height; index++){
            addObject (new brickwall(),285,380-(50*index));
        }
    }
}

