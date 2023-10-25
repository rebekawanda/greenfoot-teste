import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class patrick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class patrick extends Actor
{
    GifImage myGif = new GifImage ("patrick.gif");
    /**
     * Act - do whatever the patrick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(myGif.getCurrentImage());
    }
}
