import java.util.Scanner;

class Area
{
    double area;
      Area(double r)
    {
        area=(22*r*r)/2;
    }
    
}

public class AreaCir {
    public static void main(String[]args)
    {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the radius :");
       double rad=s.nextDouble();
       Area a=new Area(rad);
       System.out.println("Radius is:" + a.area);
       
    }
    
}
 