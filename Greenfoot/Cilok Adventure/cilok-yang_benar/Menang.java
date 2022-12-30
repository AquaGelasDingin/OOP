import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menang extends Actor
{
     public Menang()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()*1;
        int myNewWidth = (int)myImage.getWidth()*1;
        myImage.scale(myNewWidth, myNewHeight);
    }
    public void act()
    {
        
    }
}
