public class SurfaceArea
{
    public static double surfaceCirce(int r){
        return 3.14*r*r;

    }
    public static int surfaceRectangle(int a,int b){
        return a*b;
    }
    public static double surfaceTriangle(int a,int h){
        return 0.5*(a*h);
    }
    public static void wypisz(){
        System.out.println("Rectangle surface: "+surfaceRectangle(4,5));
        System.out.println("Triangle surface: "+surfaceTriangle(3,4));
        System.out.println("Circle surface: "+surfaceCirce(3));
    }
}
