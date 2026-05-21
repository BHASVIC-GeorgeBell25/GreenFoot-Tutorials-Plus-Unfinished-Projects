import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creature is a superclass for all of the moving objects in the world.
 * They can move up, down, left and right and they can eat other creatures
 * if they can see them.
 * 
 * Andrea Stewart
 * May 9, 2010
 */
public class Creature  extends Actor
{
    /**
     * There is no default action for a creature
     *
     */
    public void act() 
    {
    }    
    
    public void moveLeft()
    {
        setLocation ( getX() - 1, getY() );
    }
    
    public void moveRight()
    {       
        setLocation ( getX() + 1, getY() );
    }
    
    public void moveUp()
    {
       setLocation ( getX() , getY() - 1);
    }
    
    public void moveDown()
    {
       setLocation ( getX() , getY() + 1);
    }
    
        
    /**
     * canSee and eat methods taken from the Greenfoot CrabWorld tutorial
     */
    
        public boolean canSee(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }

    public void eat(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if(actor != null) {
            getWorld().removeObject(actor);
        }
    }
}
