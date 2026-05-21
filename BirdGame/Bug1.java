import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/** 
 * Andrea Stewart
 * May 9, 2010
 */
public class Bug1 extends Creature
{
    /**
     * Bug1s scurry horizontally across the screen, beginning from
     * random coordinates on the left side of the screen. Each time
     * they get to the left side, they switch back to the right side
     * at a random coordinate.
     */
    
    public void act() 
    {
        moveRight();
        
        if(getX()==99)
        {
            int x = Greenfoot.getRandomNumber(getWorld().getHeight());
            setLocation(0, x);
        }        


    }    
}
