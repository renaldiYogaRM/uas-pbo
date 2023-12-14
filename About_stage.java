import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class About_stage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class About_stage extends World
{

    /**
     * Constructor for objects of class About_stage.
     * 
     */

    public About_stage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 500, 1); 
        prepare();
    }
    
    private void prepare()
    {
        Back back = new Back();
        addObject(back,50,50);
        back.setLocation(828,415);
    }
}
