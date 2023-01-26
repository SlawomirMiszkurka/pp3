
public class Counter
{
    // instance variables - replace the example below with your own
    int counter=0;
    public void main(){
        Counter counter= new Counter();
        counter.decreaseBy10();
    }

    public void increaseBy1()
    {
        counter+=1;
    }
    
    public void increaseBy10(){
        counter+=10;
    }
    
    public void decreaseBy1(){
        counter-=1;
    }
    
    public void decreaseBy10(){
        counter-=10;
    }
    
    public void reset(){
        counter=0;
    }
    
    public int show(){
        return counter;
    }
}