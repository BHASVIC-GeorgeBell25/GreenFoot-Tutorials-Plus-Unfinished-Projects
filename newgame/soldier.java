import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class soldier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class soldier extends Actor
{
    /**
     * Act - do whatever the soldier wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int x = 0;
    public void act()
    {
        x=x+1;
        if (x>69){
            World MyWorld = getWorld();
            MyWorld.addObject(new bullet(),getX(),getY());
            x=0;
            x=x+Greenfoot.getRandomNumber(5);
        }
    }
}
