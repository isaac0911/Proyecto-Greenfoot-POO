import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pelota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pelota extends Actor
{
    /**
     * Act - do whatever the Pelota wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MyWorld thisGame;
    
    private int contador;
    
    public void act()
    {
        // Add your action code here.
        move (5);
        World mundo = getWorld();
        if (getX()>=mundo.getWidth() - 2){
            turn(Greenfoot.getRandomNumber(90));
        }
        if (getX()<=2){
            turn(Greenfoot.getRandomNumber(90));
        }
        if (getY()>=mundo.getHeight() - 2){
            turn(Greenfoot.getRandomNumber(90));
        }
        if (getY()<2){
            turn(Greenfoot.getRandomNumber(90));
        }
        
        if (isTouching(Barra.class)){
            turn(Greenfoot.getRandomNumber(90));
        }
        
        if (isTouching(Bloque.class)){
            removeTouching(Bloque.class);
            turn(Greenfoot.getRandomNumber(90));
            Greenfoot.playSound("bom.wav");
            contador = contador + 1;
            thisGame.cont++;
            
            if (contador == 10)
            {
            Gano g = new Gano ();
            getWorld().addObject(g,350,300);
            Greenfoot.playSound("gano.wav");
            Greenfoot.stop();
            }
        }
        
        
        if (isTouching(Perder.class)){
            Texto t = new Texto ();
            getWorld().addObject(t,400,300);
            Greenfoot.playSound("perdedor.wav");
            Greenfoot.stop();
        }
    }
}
