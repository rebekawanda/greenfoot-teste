import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class plankiton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class plankiton extends Actor
{
    GifImage myGif = new GifImage ("plankiton.gif");
    /**
     * Act - do whatever the plankiton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(myGif.getCurrentImage());  
    }
}
