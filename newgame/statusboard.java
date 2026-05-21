import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class statusboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class statusboard extends Actor
{
    int money = 0;
    protected GreenfootImage background = null;
    public statusboard(){
        background = new GreenfootImage (200, 180);
        
        background.setColor(Color.GRAY);
        
        background.fillRect (0, 0, 200, 35);
        
        setImage(background);
    }
    public void setValues (int money){
        GreenfootImage img = new GreenfootImage (background);
        img.setColor(Color.BLACK);
        
        img.drawString("                     Money: " + money, 10, 20);
        img.drawString("                                           soldier", 10, 20);
        
        setImage(img);
    }
    public void act()
    {
        money=money+1;
        setValues(money);
    }
}
