import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Rocket(){
        setRotation(270);
    }
    public void act() 
    {
        move(10);
        Actor actor = getOneIntersectingObject(Crate.class);
        if (actor!=null){
            AirRaidWorld airRaidWorld = (AirRaidWorld)getWorld();
            airRaidWorld.removeObject(actor);
            airRaidWorld.removeObject(this);
            airRaidWorld.increaseScore();
        }
        else{
            Actor plane = getOneIntersectingObject(Plane.class);
            if (plane!=null){
                AirRaidWorld airRaidWorld = (AirRaidWorld)getWorld();
                airRaidWorld.removeObject(plane);
                airRaidWorld.removeObject(this);
                airRaidWorld.increaseScore();
            }
            else{
                int yCoord = getY();
                if (yCoord <= 0){
                    World AirRaidWorld = getWorld();
                    AirRaidWorld.removeObject(this);
                }
            }
        }
    }    
}
