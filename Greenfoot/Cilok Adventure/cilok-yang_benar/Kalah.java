import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kalah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kalah extends Actor
{
     public Kalah()
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
