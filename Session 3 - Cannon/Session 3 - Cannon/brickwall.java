import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class brickwall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class brickwall extends Actor
{
    /**
     * Act - do whatever the brickwall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Actor cannonBall = getOneIntersectingObject(cannonball.class);
        if (cannonBall != null){
            World cannonworld = getWorld();
            cannonworld.removeObject(cannonBall);
        }
    }
}
