import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 500, 1);  
        prepare();
        act();
    }
    
    private void prepare()
    {
        Player player = new Player();
        addObject(player,311,365);
        player.setLocation(82,222);
        player.setLocation(60,274);

        
        player.setLocation(401,260);
        
    }
    
    public void act()
    {
        if(Greenfoot.getRandomNumber(500)<2){
        addObject(new Enemy1(),Greenfoot.getRandomNumber(1000),1);
    }

}
}
