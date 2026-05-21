import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class evil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class evil extends Actor
{
    /**
     * Act - do whatever the evil wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int health = 50;
    int x = 0;
    public void act()
    {
        move(-1);
        collision();
        if (health<=0){
            World MyWorld = getWorld();
            MyWorld.removeObject(this);
        }
    }
    public void collision(){
        Actor soldier = getOneIntersectingObject(soldier.class);
        if (soldier != null)
        {
            World MyWorld = getWorld();
            MyWorld.removeObject(soldier);
        }
        Actor bullet = getOneIntersectingObject(bullet.class);
        if (bullet != null)
        {
            x=x+1;
            if (x>6){
                health=health-10;
                x=0;
            }
        }
    }
}
