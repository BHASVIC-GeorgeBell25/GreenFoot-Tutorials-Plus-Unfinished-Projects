import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Launcher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Launcher extends Actor
{
    /**
     * Act - do whatever the Launcher wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int x = 0;
    public void act() 
    {
        if(Greenfoot.isKeyDown("right")){
            move(5);
        }
        if(Greenfoot.isKeyDown("left")){
            move(-5);
        }
        if(Greenfoot.isKeyDown("space")){
            x=x+1;
            if (x>25){
                World AirRaidWorld = getWorld();
                AirRaidWorld.addObject(new Rocket(), getX(), getY());
                x=0;
            }
        }
    }    
}
