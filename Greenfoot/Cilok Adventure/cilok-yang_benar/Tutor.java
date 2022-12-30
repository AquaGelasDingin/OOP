import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuBantuan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutor extends Menu
{

    /**
     * Constructor for objects of class MenuBantuan.
     * 
     */
    public Tutor()
    {

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        TombolKembali tombolKembali = new TombolKembali();
        addObject(tombolKembali,84,67);
        tombolKembali.setLocation(65,49);
        tombolKembali.setLocation(40,27);
        tombolKembali.setLocation(43,40);
        Rintangan rintangan = new Rintangan();
        addObject(rintangan,451,398);
        rintangan.setLocation(636,512);
        rintangan.setLocation(616,463);
    }
}
