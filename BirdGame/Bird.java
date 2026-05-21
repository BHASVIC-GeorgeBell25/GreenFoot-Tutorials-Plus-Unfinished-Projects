import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The player controls the bird, trying 
 * to eat flies and avoid larger Hawks.
 * Andrea Stewart 
 * May 9, 2010
 */
public class Bird  extends Creature
{
    private Scoreboard myBoard;
    private int count = 0;

    public Bird(Scoreboard board)
    {
        myBoard = board;
    }
    
    /**
     * In the act method the Bird will check which keys are pressed and move 
     * in that direction, and will check to see if there are any bugs, and eat
     * them. It also contains a mechanism for changing the score board each
     * time a bug is eten
     */
    public void act() 
    {
        keyCheck();
        if(canSee(Bug1.class)){
            eat(Bug1.class);
            count++;
            myBoard.setText("Bugs Eaten: " + count);
        }
        if(canSee(Bug2.class)){
            eat(Bug2.class);
            count++;
            myBoard.setText("Bugs Eaten: " + count);
        }
//         if(canSee(Hawk1.class)){
//             count--;
//             myBoard.setText("Score: " + count);
//         }
//         if(canSee(Hawk2.class)){
//             count--;
//             myBoard.setText("Score: " + count);
//         }    
    }
    
    private void keyCheck()
    {
       if (Greenfoot.isKeyDown("left") )
        {
            setImage("bird_left.png");
            moveLeft();

        }
        
        if (Greenfoot.isKeyDown("right") )
        {
            setImage("bird_right.png");
            moveRight();

        }
        if (Greenfoot.isKeyDown("up") )
        {
            setImage("bird_up.png");
            moveUp();
        }
        if (Greenfoot.isKeyDown("down") )
        {
            setImage("bird_down.png");
            moveDown();
        }
    }
    
}
