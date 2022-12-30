import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hunter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Akang
 extends Actor
{
    int vSpeed = 0;
    int Nyawa = 3;
    int accel = 1;
    int score = 0;
    int jumpHeight = -8;
    int coinTaken;
    Peluru peluru = new Peluru();
    public void fall()
    {
        setLocation(getX(), getY() + vSpeed);
    }
    public void checkFalling(){
        if(!isTouching(Rintangan.class))
        {
            vSpeed = vSpeed + accel;
        }
        else if(isTouching(Rintangan.class)){
            vSpeed = 0;
        }
    }
    public void detectMusuhCollision()
    {
        if(isTouching(Musuh.class)){
            setLocation(40, 327);
            removeNyawa();
            
        }
    }
    public void removeNyawa()
    {
        Nyawa--;
        Latar m = (Latar) getWorld();
        m.updatenyawa(-1);
    }
    public void takeCoin()
    {
        if(isTouching(Cilok.class)){
        removeTouching(Cilok.class);
        Greenfoot.playSound("hap.wav");
        Latar m = (Latar) getWorld();
        m.addscore(10);
        coinTaken++;
        }
    }
    public void jump(){
        if(Greenfoot.isKeyDown("space")){
            vSpeed = jumpHeight;
            fall();
        }
        
    }
    boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0,getImage().getHeight()/2, Rintangan.class);
        return under != null;
    }
    public void tombol()
    {
        if (Greenfoot.isKeyDown("left")){
            turn(360);
            setLocation(getX()-4, getY());
        }
        if (Greenfoot.isKeyDown("right")){
            setLocation(getX()+4, getY());
        }
    }
    public Akang()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/1;
        int myNewWidth = (int)myImage.getWidth()/1;
        myImage.scale(myNewWidth, myNewHeight);
    }
    public void fireProject(){
        if(Greenfoot.mousePressed(null)){
            Greenfoot.playSound("tembakbos.mp3");
            Peluru peluru = new Peluru();
            getWorld().addObject(peluru, getX(), getY());
            peluru.turnTowards(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
        }
    }
    public void detectResep()
    {
        if(isTouching(Resep.class)){
            removeTouching(Resep.class);
            Greenfoot.playSound("winer.wav");
            Latar m = (Latar) getWorld();
            m.endGame();
            
            
        }
    }
    public void act()
    {
        jump();
        onGround();
        checkFalling();
        fall();
        tombol();
        fireProject();
        detectMusuhCollision();
        takeCoin();
        detectResep();
    }


}
