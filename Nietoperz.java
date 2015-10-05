import greenfoot.*;

public class Nietoperz extends Zwierze
{
    public Nietoperz(){
      nazwa = "kogut";
      dzwiek = new GreenfootSound("kogut.wav");
    }  
    
    public void act(){
      if (Greenfoot.mousePressed(this)){
        super.act();
        getWorld().showText("Jestem skrzyżowaniem koguta z nietoperzem ;) ", 400, 50);
        }
    }
}
