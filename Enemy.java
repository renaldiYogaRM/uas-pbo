import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemy(){
        setImage("enemy_1.png");
        GreenfootImage img = this.getImage();
        img.scale(100,100);
        this.setImage(img);
    }
    public void act()
    {
        // Add your action code here.
    }
}
