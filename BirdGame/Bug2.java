import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * @Andrea Stewart 
 * @May 9, 2010
 */
public class Bug2  extends Creature
{
    /**
     * Bug2s move in the opposite direction of Bug1s but 
     * share the same behavior.
     */
    
    public void act() 
    {
        moveLeft();
        
       if(getX()==0)
       {
           int x = Greenfoot.getRandomNumber(getWorld().getHeight());
           setLocation(getWorld().getWidth(), x);
       }
    }    
}
