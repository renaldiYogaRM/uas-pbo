import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back extends Button
{
    /**
     * Act - do whatever the Back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Back(){
        GreenfootImage img = this.getImage();
        img.scale(150,150);
        this.setImage(img);
    }
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            World back = getWorld();
            back = new Start();
            Greenfoot.setWorld(back);
        }
    } 
}
