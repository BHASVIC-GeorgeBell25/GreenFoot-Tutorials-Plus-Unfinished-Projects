import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Hawks move horizontally across the screen at twice the speed of
 * other creatures and will eat a bird if it sees it. When a Hawk 
 * reaches the edge of the screen, it will go back to the other side
 * at a random height.
 * HAWKS ARE ANIMATED. YES.
 * Andrea Stewart
 * May 9 2010
 */

public class Hawk1 extends AnimatedActor 
{

    public Hawk1() {
       super("Hawk1", ".png", 10);
    }
    
    public void act() 
    {
        super.act();
        
        setLocation ( getX() + 2, getY() );
        
        if(getX()==99)
        {
            int x = Greenfoot.getRandomNumber(80);
            setLocation(0, x);
        }
        
       if(canSee(Bird.class))
       {
           eat(Bird.class);
        }
    }
}
