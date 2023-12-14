import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tutorial_stage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorial_stage extends World
{

    /**
     * Constructor for objects of class Tutorial_stage.
     * 
     */
    public Tutorial_stage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 500, 1); 
        prepare();
    }
    private void prepare()
    {
        Back2 back2 = new Back2();
        addObject(back2,50,50);
        back2.setLocation(850,440);
    }
}
