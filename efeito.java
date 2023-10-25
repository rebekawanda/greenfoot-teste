import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class efeito here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class efeito extends bobesponja
{
    /**
     * Act - do whatever the efeito wants to do. This method is called whenever
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
        int x = (int) Math.round(getX() + Math.cos(angle));
        int y = (int) Math.round(getY() + Math.sin(angle));
        
        setLocation(x, y);
}

public void acertaralvo(){
    Actor f = getOneIntersectingObject(lulamolusco.class);
    
    if (f!= null){
        Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
        counter.add(1);
        getWorld().removeObject(f);
        getWorld().removeObject(this);
    }
}
}
