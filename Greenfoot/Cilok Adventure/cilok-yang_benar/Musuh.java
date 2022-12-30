import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Musuh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Musuh extends Actor
{
    int speed = -2;
    int count = 0;
    int nyawa; 
    public Musuh()
    {
        
        getImage().mirrorHorizontally();
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/2;
        int myNewWidth = (int)myImage.getWidth()/2;
        myImage.scale(myNewWidth, myNewHeight);
    }

    public void act()
    {
        count++;
        move();
    }
    public void move(){
        if(count < 30)
            setLocation(getX() + speed, getY());
        else{
            speed = - speed;
            getImage().mirrorHorizontally();
            count = 0;
        }
    }
}

