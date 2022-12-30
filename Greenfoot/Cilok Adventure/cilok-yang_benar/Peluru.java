import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Peluru here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Peluru extends Actor
{
    int speed = 10;
    public Peluru(){
        getImage().scale(50,5);
    }
    public void gerak()
    {
        setLocation(getX(), getY());
        if(getY()<20){
            getWorld().removeObject(this);
        }else{
            cek_kena();
        }
    }
    public void cek_kena(){
        if(isTouching(Musuh.class)){
            getWorld().addObject(new PencaranDarah(), getX(), getY());
            Latar m = (Latar) getWorld();
            m.addscore(20);
            removeTouching(Musuh.class);
            
        }else if (isAtEdge())
            getWorld().removeObject(this);
    }
    public void act()
    {
        gerak();
        move(speed);
        
    }
    
    /*public void turnToMouse()
    {
        setLocation(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
    }*/

}
