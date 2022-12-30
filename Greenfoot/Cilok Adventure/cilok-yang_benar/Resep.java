import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Diamond here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Resep extends Actor
{
        public Resep()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()+3;
        int myNewWidth = (int)myImage.getWidth()+3;
        myImage.scale(myNewWidth, myNewHeight);
    }
    public void act()
    {
        // Add your action code here.
    }
}
