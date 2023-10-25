import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wanda extends World
{
    private GreenfootSound bgMusic = new GreenfootSound("music.mp3");
     public void started()
    {
         bgMusic.playLoop();
    }
     
     public void stopped()
    {
        bgMusic.pause();
    }
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public wanda()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        bobesponja bobesponja = new bobesponja();
        addObject(bobesponja,360,332);
        lulamolusco lulamolusco = new lulamolusco();
        addObject(lulamolusco,464,332);
        Counter counter = new Counter();
        addObject(counter,55,75);
        Counter2 counter2 = new Counter2();
        addObject(counter2,685,76);
        plankiton plankiton = new plankiton();
        addObject(plankiton,642,504);
        patrick patrick = new patrick();
        addObject(patrick,94,288);
    }
}
