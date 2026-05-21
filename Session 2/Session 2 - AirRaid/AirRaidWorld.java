import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AirRaidWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AirRaidWorld extends World
{
    private int score = 0;
    private int lives = 5;
    private StatusBoard scoreBoard;
    /**
     * Constructor for objects of class AirRaidWorld.
     * 
     */
    public AirRaidWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        scoreBoard = new StatusBoard();
        addObject(scoreBoard,50,370);
        scoreBoard.updateStatus(score,lives);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Launcher launcher = new Launcher();
        addObject(launcher,297,369);
        Plane plane = new Plane();
        addObject(plane,390,127);
    }

    public void increaseScore(){
        score=score+1;
        scoreBoard.updateStatus(score,lives);
    }
    public int getscore(){
        return score;
    }
    public void loseLife(){
        lives=lives-1;
        scoreBoard.updateStatus(score,lives);
    }
    public int getLives(){
        return lives;
    }
}
