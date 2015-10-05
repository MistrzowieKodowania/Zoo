import greenfoot.*;

public class Podworko extends World
{
    public Podworko()
    {    
        super(800, 600, 1); 
        
        Kot mruczek = new Kot();
        addObject(mruczek, 150, 300);
        Pies burek = new Pies();
        addObject(burek, 150, 500);
        Nietoperz gacek = new Nietoperz();
        addObject(gacek, 400, 300);
        Kaczka kwa = new Kaczka();
        addObject(kwa, 400, 500);
        Lisek chytrusek = new Lisek();
        addObject(chytrusek, 650, 300);
        Kon konik = new Kon();
        addObject(konik, 650, 500);
                
        showText("Kliknij dowolne zwierzę", 400, 50); 
    }    
}
