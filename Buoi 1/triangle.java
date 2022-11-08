package cigg;
import java.lang.Math;
public class triangle {
    public double a;
    public double b;
    public double c;

    public double perimeter()
    {
        return a+b+c ;
    }
    public double p()
    {
        return (double) (a+b+c)/2;
    }
    public double area()
    {
        return Math.sqrt((double) p() * ((double) p() - a) * ((double) p() - b) * ((double) p() - c));
    }
}
