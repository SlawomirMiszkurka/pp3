
public class Rectangles
{
    

int a,b;
    public void Rectangles()
    {
        Rectangles first = new Rectangles();
        Rectangles second= new Rectangles();
        first.a=3;
        first.b=4;
        second.a=2;
        second.b=7;
        first.description();
        second.description();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void dimensions()
    {
        System.out.println("Dimensions of rectangle: "+a+" and "+b);
        }
        
    public int perimeter(){
        return 2*a+2*b;
    }
    
    public int surface(){
        return a*b;
    }
    public void description(){
        dimensions();
        System.out.println("Peremiter equals "+perimeter()+". Surface equals "+surface());
    }
}
