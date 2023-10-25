import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class intro extends World
{

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

        //Intro
        if (Greenfoot.isKeyDown("enter")){
            setBackground(new GreenfootImage("intro.png"));
        }
        //Diálogo lula molusco
        if (Greenfoot.isKeyDown("enter")){
            setBackground(new GreenfootImage("lula1.png"));
        }
        //Diálogo bob esponja 
        if (Greenfoot.isKeyDown("enter")){
            setBackground(new GreenfootImage("bob2.png"));
        }
        //Iniciar o jogo
        if (Greenfoot.isKeyDown("enter")){
            wanda wanda = new wanda();
            Greenfoot.setWorld(wanda);
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
