import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crate extends Actor
{
    /**
     * Act - do whatever the Crate wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Crate(){
        setRotation(90);
    }
    public void act() 
    {
        move(2);
        Actor launch = getOneIntersectingObject(Launcher.class);
        if (launch != null){
            World AirRaidWorld = getWorld();
            AirRaidWorld.removeObject(launch);
            AirRaidWorld.removeObject(this);
        }
        else{
            int yCoord = getY();
            if (yCoord >= 399){
                AirRaidWorld airRaidWorld = (AirRaidWorld)getWorld();
                airRaidWorld.removeObject(this);
                airRaidWorld.loseLife();
            }
            }
    }    
}
