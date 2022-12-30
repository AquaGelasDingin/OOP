import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PencaranDarah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PencaranDarah extends Actor
{
    private int jeda = 10;
    public PencaranDarah()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/4;
        int myNewWidth = (int)myImage.getWidth()/3;
        myImage.scale(myNewWidth, myNewHeight);
    }
    public void act()
    {
        if(jeda > 0) jeda --;
        else getWorld().removeObject(this);
    }
}
