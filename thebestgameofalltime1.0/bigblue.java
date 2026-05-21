import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bigblue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bigblue extends Actor
{
    /**
     * Act - do whatever the bigblue wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static final int GRAVITY = 1;
    protected int ySpeed = 0;
    protected int check = 0;
    protected int timer = 0;
    protected int impulse = 0;
    public void act()
    {
        if (Greenfoot.isKeyDown("left")){
            move(-4);
        }
        if (Greenfoot.isKeyDown("right")){
            move(4);
        }
        if ((getY() > 370)){
            ySpeed = 0;
            setLocation(getX() ,370);
            if (Greenfoot.isKeyDown("up")){
                ySpeed=17;
            }    
        }
        setLocation(getX(),getY() - ySpeed);
        ySpeed = ySpeed - GRAVITY;
        //((getY()<y2 + 50)||(getY()>y2 - 50))
        //&& (Greenfoot.isKeyDown("left"))
        //&& (Greenfoot.isKeyDown("right")
        Actor platform = getOneIntersectingObject(platform.class);
        if (platform != null){
            int x2 = platform.getX();
            int y2 = platform.getY();
            if ((getX()>x2+54)){
                World MyWorld = getWorld();
                setLocation(x2 + 61, getY());
            }
            else if ((getX()<x2-54)){
                World MyWorld = getWorld();
                setLocation(x2 - 61, getY());
            }
            else if ((getY()>y2) && ((getX()<x2 + 50)||(getX()>x2 - 50))){
                World MyWorld = getWorld();
                setLocation(getX(), y2 + 55);
                ySpeed = 0;
            }
            else if ((getY()<y2) && ((getX()<x2 + 50)||(getX()>x2 - 50))){
                World MyWorld = getWorld();
                setLocation(getX(), y2 - 56);
                ySpeed = 0;
            }
            if ((ySpeed == 0) && (Greenfoot.isKeyDown("up"))){
                ySpeed = 17;
            }
            check = 1;
            timer = 10;
        }
        if (platform == null){
            timer = timer - 1;
            impulse = impulse - 1;
            if (timer > 0){
                if (Greenfoot.isKeyDown("up")&&(impulse<0)){
                    ySpeed = 17;
                    impulse = 10;
                }
            }
        }
        
        //if (isTouching(platform.class)&&Greenfoot.isKeyDown("left")){
        //    move(4);
        //}
        //if (isTouching(platform.class)&&Greenfoot.isKeyDown("right")){
        //    move(-4);
        //}
        //Actor platform = (Actor)getWorld().getObjects(platform.class).get(0);
        //int x1 = platform.getX();
        //int y1 = platform.getY();
        //if (isTouching(platform.class)){
        //    
        //    setLocation(getX(), y1 -40);
        //}
    }
}

