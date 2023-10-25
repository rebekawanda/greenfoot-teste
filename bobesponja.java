import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bobesponja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bobesponja extends Actor
{
public int speed = 1;
 public int sTimer;
 GreenfootSound hadu = new GreenfootSound("hadu.mp3");
    /**
     * Act - do whatever the bobesponja wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
      movimento();  
    }
    public void movimento(){
        
            if (Greenfoot.isKeyDown("s")){
            this.setLocation(this.getX(), this.getY() + speed);
        }
           else if (Greenfoot.isKeyDown("w")){
            this.setLocation(this.getX(), this.getY() - speed);
        }
            else if (Greenfoot.isKeyDown("a")){
            this.setLocation(this.getX() - speed, this.getY());
        }
            else if (Greenfoot.isKeyDown("d")){
            this.setLocation(this.getX()+ speed, this.getY());
        }
            else if (Greenfoot.isKeyDown("f") && (sTimer == 0)){
            sTimer ++;
            getWorld().addObject(new efeito(), getX() - 100, getY() + 30);
       }  
           else {
           if (Greenfoot.isKeyDown("f")){
               sTimer = 0;
               hadu.play();
           }
       }
}
}
