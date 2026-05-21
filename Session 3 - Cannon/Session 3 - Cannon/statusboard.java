import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class statusboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class statusboard extends Actor
{
    protected GreenfootImage background = null;
    public statusboard(){
        background = new GreenfootImage (100, 180);
        
        background.setColor(Color.WHITE);
        
        background.fillRect (0, 0, 150, 60);
        
        setImage(background);
    }
    public void setValues (int angle, int power){
        GreenfootImage img = new GreenfootImage (background);
        img.setColor(Color.BLACK);
        
        img.drawString("Angle: " + angle, 10, 20);
        img.drawString("Power: " + power, 10, 35);
        
        setImage(img);
    }
    public void act()
    {
        //
    }
}
