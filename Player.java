import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private int score = 0;
    int lastNameNo = 1;
    int animationDelay = 3;
    public int jumlahFishDimakan = 0;
    public int enemyDimakan = 0;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Player(){
        setImage("gurita.png");
        GreenfootImage img = this.getImage();
        img.scale(100,100);
        this.setImage(img);
    }
    public void act()
    {
        keyboardControl();
        animate();
        eatEnemy1();
    }
    
    public void keyboardControl(){
        if(Greenfoot.isKeyDown("S")){
        setLocation(getX(), getY()+5);
        }
        if(Greenfoot.isKeyDown("W")){
        setLocation(getX(), getY()-5);
        }
        if(Greenfoot.isKeyDown("A")){
        setLocation(getX()-5, getY());
        }
        if(Greenfoot.isKeyDown("D")){
        setLocation(getX()+5, getY());
        }
    }
    
    public void animate(){
        if(animationDelay<3){
            animationDelay++;
            return;
        }
        animationDelay = 0;
        if(lastNameNo==17){
            lastNameNo = 1;
        }else{
            lastNameNo++;
        }
        
        this.setImage(new GreenfootImage("gurita"+lastNameNo+".png"));
        GreenfootImage img = this.getImage();
        img.scale(100,100);
        this.setImage(img);
    }
    public void eatEnemy1(){
        Actor getEnemy1 = getOneIntersectingObject(Enemy1.class);
        World world = getWorld();
        if(getEnemy1 != null)
        {
            getWorld().removeObject(getEnemy1);
            enemyDimakan++;
        }
        if(enemyDimakan >0)
        {
            Lose lose = new Lose();
            Greenfoot.setWorld(lose);
        }
    }
}
