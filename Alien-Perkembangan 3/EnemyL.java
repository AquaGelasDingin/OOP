import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyL extends Enemy
{
    /**
     * Act - do whatever the EnemyL wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public EnemyL()
    {
        super();
    }
    
    public EnemyL(int speed)
    {
        super(speed);
    }
    
    public void act()
    {
        super.enemyMove();
        turn(1);
    }
}
