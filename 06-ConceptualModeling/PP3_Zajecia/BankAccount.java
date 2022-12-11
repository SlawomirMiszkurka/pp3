    
public class BankAccount
{
    private double stanKonta;
    private String wlasciciel, numerKonta, bank,waluta;
    
    
    public BankAccount(){
    wlasciciel = "Jan Nowak";
    numerKonta = "1399 2137 0000 7424";
    waluta = "PLN";
    stanKonta = 12.63;
}    

    public double wplac(int y){
        stanKonta=stanKonta + y;
        return stanKonta;
    }
    
    public double getStanKonta(){
        return stanKonta;
    }
    
    public boolean wyplac(int y){
        if(stanKonta>=y&& y<=500){
        stanKonta=stanKonta - y;
        return true;
    }
        else;
        return false;
    }


}
