import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ship extends Actor
{
    /**
     * Act - do whatever the Ship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn();
        collision();
    }
    public void moveAndTurn(){
        if (Greenfoot.isKeyDown("up")){
            move(5);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            move(-5);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(5);
        }
        if (Greenfoot.isKeyDown("space"))
        {
            turn(180);
        }
    }
    public void collision(){
        Actor crate = getOneIntersectingObject(Crate.class);
        if (crate != null)
        {
            World shipWorld = getWorld();
            shipWorld.removeObject(crate);
        }
        Actor sub = getOneIntersectingObject(Submarine.class);
        if (sub != null){
            World shipWorld = getWorld();
            shipWorld.removeObject(this);
        }
    }
}
