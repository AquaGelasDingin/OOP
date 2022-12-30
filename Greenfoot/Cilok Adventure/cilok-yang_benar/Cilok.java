import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Koin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cilok extends Actor
{
    public Cilok()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()*1;
        int myNewWidth = (int)myImage.getWidth()*1;
        myImage.scale(myNewWidth, myNewHeight);
    }
    public void act()
    {
        // Add your action code here.
    }
}
