
public class Lamp
{
    boolean czyWlaczona;
    public void wlaczLampe(){
        czyWlaczona= true;
    }
    public void wylaczLampe(){
        czyWlaczona = false;
    }
    public void lampaWylaczona(){
        if (czyWlaczona == false){
            System.out.println("Lampa jest wyłączona");
        }
    }
    public static void main(String[] args){
        Lamp lampa = new Lamp();
        lampa.czyWlaczona=false;
        lampa.lampaWylaczona();
        lampa.wlaczLampe();
        lampa.lampaWylaczona();
        lampa.wylaczLampe();
        lampa.lampaWylaczona();
    }
    
}
