import greenfoot.*;

public class Lisek extends Zwierze
{
    public Lisek(){
    nazwa = "lisek";
    dzwiek = new GreenfootSound("wilk.wav");
    } 
    
    public void act(){
    if (Greenfoot.mousePressed(this)){
      getWorld().showText("Jestem lisem, ale udaję wilka ;) ", 400, 50);
      dzwiek.play();}    
    }
}
