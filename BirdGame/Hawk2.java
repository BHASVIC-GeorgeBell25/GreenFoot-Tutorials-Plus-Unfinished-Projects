import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Hawk2s share the same behavior as Hawk1s but move from right to left.
 * THEY ARE ANIMATED. AWESOME.
 * 
 * Andrea Stewart 
 * May 9, 2010
 */
public class Hawk2 extends AnimatedActor
{

    public Hawk2(){
        super("Hawk2", ".png", 10);
    }
    public void act() 
    {
      super.act();
      
      setLocation ( getX() - 2, getY() );
        
       if(getX()==0)
       {
           int x = Greenfoot.getRandomNumber(80);
           setLocation(100, x);
       }
       
       if(canSee(Bird.class))
       {
           eat(Bird.class);
        }
    }    
}
