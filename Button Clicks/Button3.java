import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;

/**
 * Write a description of class Button3 here.
 * 
 * @author Nichodon
 * @version 0.1.2
 */
public class Button3 extends Actor
{
    GreenfootImage clickme_1 = new GreenfootImage("Clickme.png");
    GreenfootImage clickme_2 = new GreenfootImage("Clickme2.png");
    GreenfootImage clickme_3 = new GreenfootImage("BLANK!!!!.png");
    boolean mouseDown = false;
    private boolean clickBug = true;
    public Button3() {
        setImage(clickme_1);
    }

    /**
     * Act - do whatever the Button3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Buttons mySpecialWorld_YAY = (Buttons)getWorld();
        if (!mouseDown && Greenfoot.mousePressed(this) && clickBug == true) {    
            setImage(clickme_2);
            mouseDown = true;
        }
        if (Greenfoot.mouseClicked(null)) {
            mouseDown = false; 
            setImage(clickme_3);
            mySpecialWorld_YAY.changePage(true);
            clickBug = false;
        }
        if(mySpecialWorld_YAY.getDaPage() && Greenfoot.mouseClicked(this)) {
            setImage(clickme_3);
            mouseDown = false;
            mySpecialWorld_YAY.changePage(true);
            clickBug = false;
        }
        // Add your action code here.
    }    
}
