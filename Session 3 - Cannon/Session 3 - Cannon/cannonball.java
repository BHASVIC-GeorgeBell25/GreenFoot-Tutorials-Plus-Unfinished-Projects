import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cannonball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cannonball extends Actor
{
    /**
     * Act - do whatever the cannonball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static final int GRAVITY = 2;
    protected int xSpeed = 0;
    protected int ySpeed = 0;
    
    public cannonball(int angle, int power){
        power = (power*10)/25;
        xSpeed = (int)(power*Math.cos(Math.toRadians(angle)));
        ySpeed = (int)(power*Math.sin(Math.toRadians(angle)));
    }
    public void act()
    {
        setLocation(getX() + xSpeed,getY() - ySpeed);
        ySpeed = ySpeed - GRAVITY;
        
        World CannonWorld = getWorld();
        if (getY() > CannonWorld.getHeight()){
            CannonWorld.removeObject(this);
        }
    }
}
