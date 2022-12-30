import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fire extends Actor
{
    /**
     * Act - do whatever the Fire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int moving = 8;
    
    public void act()
    {
        move(moving);
        removeFromWorld();
    }
    
    private void removeFromWorld()
    {
        if (isTouching(Enemy.class)){
            //Greenfoot.playSound("tes.mp3");
            getWorld().addObject(new Boom(), getX(), getY());
            removeTouching(Enemy.class);
            getWorld().removeObject(this);
        }else if(isTouching(Enemy2.class)){
            Greenfoot.playSound("baah.mp3");
            getWorld().addObject(new Boom(), getX(), getY());
            removeTouching(Enemy2.class);
            getWorld().removeObject(this);
        }else if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
