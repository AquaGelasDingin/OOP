import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuUtama here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class MenuUtama extends Menu
{

    /**
     * Constructor for objects of class MenuUtama.
     * 
     */
    
    public MenuUtama()
    {
    
        prepare();
    }
   
    
    private void prepare()
    {
        TombolMulai tombolMulai = new TombolMulai();
        addObject(tombolMulai,156,420);
        tombolMulai.setLocation(179,420);
        TombolBantuan tombolBantuan = new TombolBantuan();
        addObject(tombolBantuan,403,415);
        tombolBantuan.setLocation(488,415);
        tombolMulai.setLocation(260,428);
        tombolBantuan.setLocation(450,414);
        tombolMulai.setLocation(220,430);
        tombolBantuan.setLocation(422,432);
        tombolMulai.setLocation(308,333);
        tombolMulai.setLocation(360,261);
        tombolMulai.setLocation(369,270);
        tombolBantuan.setLocation(307,398);
        tombolMulai.setLocation(343,287);
        tombolBantuan.setLocation(350,406);
        tombolBantuan.setLocation(350,406);
        tombolBantuan.setLocation(395,368);
        removeObject(tombolBantuan);
        tombolMulai.setLocation(455,329);
        TombolBantuan tombolBantuan2 = new TombolBantuan();
        addObject(tombolBantuan2,672,333);
        tombolMulai.setLocation(413,324);
        tombolBantuan2.setLocation(550,325);
        tombolBantuan2.setLocation(556,330);
    }
}
