import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class efeito2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class poderzinho extends lulamolusco
{
    /**
     * Act - do whatever the efeito2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAtaque();
        acertaralvo();
    }
    public void moveAtaque()
    {
        double angle = Math.toRadians( getRotation() );
        int x = (int) Math.round(getX() - Math.cos(angle));
        int y = (int) Math.round(getY() - Math.sin(angle));
        
        setLocation(x, y);

    }
    public void acertaralvo(){
    Actor g = getOneIntersectingObject(bobesponja.class);
    
    if (g!= null){
        Counter counter2 = (Counter) getWorld().getObjects(Counter.class).get(0);
        counter2.add(1);
        getWorld().removeObject(g);
        getWorld().removeObject(this);
    }
}
}
