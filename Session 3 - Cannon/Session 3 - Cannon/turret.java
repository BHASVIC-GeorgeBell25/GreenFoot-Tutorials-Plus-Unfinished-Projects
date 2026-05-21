import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class turret here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class turret extends Actor
{
    /**
     * Act - do whatever the turret wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected int angle = 0;
    protected int power = 100;
    int x = 0;
    int y = 15;
    protected statusboard statusboard;
    
    public turret (statusboard board){
        statusboard = board;
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("left")&&(angle<90)){
            angle=angle+1;
        }
        if (Greenfoot.isKeyDown("right")&&(angle>0)){
            angle=angle-1;
        }
        if (y>30){
            x = 31;
        }
        if (Greenfoot.isKeyDown("space")&&x>30){
            World CannonWorld = getWorld();
            cannonball ball = new cannonball(angle,power);
            CannonWorld.addObject(ball,getX(),getY());
            x=0;
            y=0;
        }
        setRotation(-angle);
        
        statusboard.setValues(angle,power);
        x=x+1;
    }
}
