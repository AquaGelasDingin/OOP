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
        super(600, 400, 1); 
        prepare();
    }
    
        int enemyCount = 0;
    
    public void act()
    {
        spawnEnemy();
    }
    
    public void addEnemy()
    {
        addObject(new Enemy(),600,Greenfoot.getRandomNumber(400));
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Hero hero = new Hero();
        addObject(hero,48,158);
        hero.setLocation(39,194);

        Enemy enemy = new Enemy();
        addObject(enemy,537,205);

        EnemyL enemyL = new EnemyL();
        addObject(enemyL,551,137);
        EnemyL enemyL2 = new EnemyL(3);
        addObject(enemyL2,457,98);
        removeObject(enemyL);
        enemyL2.setLocation(533,124);
    }
    
    private int timerEnemy = 0;
    private void spawnEnemy()
    {
        if (timerEnemy==180)
            {
                addObject(new Enemy(Greenfoot.getRandomNumber(4)+1),
                599,Greenfoot.getRandomNumber(400));
                
                timerEnemy = 0;
            } else{
                timerEnemy++;
            }
    }
}
