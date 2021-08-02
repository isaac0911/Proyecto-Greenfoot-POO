import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static int cont = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        Barra b = new Barra();
        addObject (b,400,550);
        
        Pelota p2 = new Pelota();
        addObject (p2,400,400);
        
        Perder q1 = new Perder();
        addObject (q1,258,597);
        
        Perder q2 = new Perder();
        addObject (q2,542,597);
        
        Bloque b1 = new Bloque();
        addObject (b1,100,100);
        
        Bloque b2 = new Bloque();
        addObject (b2,200,100);
        
        Bloque b3 = new Bloque();
        addObject (b3,300,100);
        
        Bloque b4 = new Bloque();
        addObject (b4,400,100);
        
        Bloque b5 = new Bloque();
        addObject (b5,500,100);
        
        Bloque b6 = new Bloque();
        addObject (b6,600,100);
        
        Bloque b7 = new Bloque();
        addObject (b7,200,225);

        Bloque b8 = new Bloque();
        addObject (b8,300,225);
        
        Bloque b9 = new Bloque();
        addObject (b9,400,225);
        
        Bloque b10 = new Bloque();
        addObject (b10,500,225);
        
        prepare();
    }
    
    public void act()
    {
        showText("Puntos: "+ cont, 75, 25);
    }
    
    public void prepare()
    {
        cont = 0;
        showText("Puntos: "+ cont, 75, 25);
    }
}
