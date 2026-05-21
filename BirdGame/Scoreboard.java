import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Keeps score.
 * 
 * Andrea Stewart 
 * May 9, 2010
 */
public class Scoreboard  extends Actor
{
    
    public Scoreboard(String score)
    {
        GreenfootImage board = new GreenfootImage(100, 30);
        board.drawString(score, 2, 20);
        setImage(board);
    }
    
    public void setText(String score)
    {
        GreenfootImage board = getImage();
        board.clear();
        board.drawString(score, 2, 20);
        
    }
}
