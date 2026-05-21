import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The main class describing the world and initial conditions of my game.
 * 
 * Andrea Stewart
 * May 9, 2010
 */
public class BirdGame  extends World
{
    private static final int BUGS = 25;
    
    /**
     * Constructor for objects of class BirdGame.
     * Adds a Bird() in the center of the screen.
     * Adds Bug()s at random places on the screen
     * Adds two Hawk()s at random places on each side of the screen
     */
    public BirdGame()
    {    
        // Create a new world with 100x80 cells with a cell size of 5x5 pixels.
        super(100, 80, 5);
        setBackground("sky.jpg");
        Scoreboard board = new Scoreboard("Bugs Eaten: 0");
        addObject(board, 20, 75);
        
        //add the Bird() in the middle of the playing area
        Bird bird = new Bird(board);
        addObject(bird, getWidth()/2, getHeight()/2);
        //add some bugs
        for (int i=0; i<BUGS; i++){
            int x = Greenfoot.getRandomNumber(getWidth()/3);
            int y = Greenfoot.getRandomNumber(getHeight());
            int z = getWidth() - Greenfoot.getRandomNumber(getWidth()/3);
            addObject (new Bug1(), x, y);
            addObject (new Bug2(), z, y);
        }
        //add the hawks
        addObject(new Hawk1(), 0, Greenfoot.getRandomNumber(getHeight()));
        addObject(new Hawk2(), 100, Greenfoot.getRandomNumber(getHeight()));
        
    }
    
}
