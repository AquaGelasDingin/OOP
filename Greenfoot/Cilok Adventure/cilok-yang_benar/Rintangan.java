import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rintangan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rintangan extends Actor
{
    public Rintangan(int height, int width){
        getImage().scale(height, width);
    }
    public Rintangan()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()*2;
        int myNewWidth = (int)myImage.getWidth()*4;
        myImage.scale(myNewWidth, myNewHeight);
    }
    public void act()
    {
        if(getX() <= 1){
            setLocation(getX() + 500, Greenfoot.getRandomNumber(250)+50);
    }
    }
}
