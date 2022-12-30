import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TombolKembali here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TombolKembali extends Actor
{
    public TombolKembali(){
        GreenfootImage image = getImage();
        image.scale (image.getWidth()/2, image.getHeight()/2);
        setImage(image);
    }
    public void act()
    {
        if(Greenfoot.mousePressed(this))
       {
           getImage().scale((int)Math.round(getImage().getWidth()*0.9), (int)Math.round(getImage().getHeight()*0.9));

       }
       if(Greenfoot.mouseClicked(this))
       {
           Greenfoot.delay(2);
           Greenfoot.setWorld(new MenuUtama());
       }
    }
}
