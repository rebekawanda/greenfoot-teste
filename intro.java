import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class intro here.
 * 
 */
public class intro extends World
{
    public int temp = 25;
    public int temp1 = 25;
    public int temp2 = 25;
    public int temp3 = 25;
    /**
     * Constructor for objects of class intro.
     * 
     */
    public intro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 

        prepare();
    }

    public void act(){
        temp1--;

        //Diálogo lula
        if (Greenfoot.isKeyDown("enter") && (temp1 < 1)){
            setBackground(new GreenfootImage("lula1.png"));
            temp2--;
        }
        //Diálogo bob
        if (Greenfoot.isKeyDown("enter") && (temp2 < 1)){
            setBackground(new GreenfootImage("bob2.png"));
            temp3--;
        }
        //Iniciar o jogo
        if (Greenfoot.isKeyDown("enter") && (temp3 < 1)){
            wanda world = new wanda();
            Greenfoot.setWorld(world);
        }
    }
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
    }
}