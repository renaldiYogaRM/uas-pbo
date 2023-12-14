import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lose here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lose extends World
{

    /**
     * Constructor for objects of class Lose.
     * 
     */
    public Lose()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 500, 1); 
        prepare();
    }
    
    private void prepare()
    {
        playAgain playagain = new playAgain();
        addObject(playagain,50,50);
        playagain.setLocation(810,377);

        gameOver gameover = new gameOver();
        addObject(gameover,100,100);
        gameover.setLocation(520,189);
    }
}
