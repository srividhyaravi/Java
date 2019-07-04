
package college;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;


public class circle 
{     double radius;
      circle(double radius)
      {
          this.radius=radius;
      }
      
      double area()
      {
          return 3.14*radius*radius;
      }
}

class sector extends circle
{
    double radianAngle;
    sector( double radius,double degreeAngle)
    {
        super(radius);
        this.radianAngle=degreeAngle*(3.142/180);       
    }
    
    double area()
    {
        return (radius*radius*radianAngle)/2;
    }
}
class segment extends circle 
{
    double length;
    segment(double radius,double length)
    {
        super(radius);
        this.length=length;
    }
    double area()
    {
        double d;
        d = (radius-length)/radius;
        double m=Math.pow(((2.0*radius*length)-(length*length)),0.5);
        return (radius*radius*d)-((radius-length)*m);
    }
}
class main
{
    public static void main(String[] args) 
    {   int ch;
    double n,m,area;
    // circle ref;
        Scanner sc=new Scanner(System.in);
        while(true)
        {
       System.out.println("enter 1.circle,2.sector,3.segment");
       ch=sc.nextInt();
       switch(ch)
       {     case 1: System.out.println("enter radius ");
                      n=sc.nextDouble();
                    circle c=new circle(n);
                   // ref=c;
                      
                      System.out.println("area of circle is "+c.area());
                      break;
                      
       case 2:  System.out.println("enter radius ");
                    n=sc.nextDouble();
                      System.out.println("enter angle in degree");
                       m=sc.nextDouble();
                     
                    sector s=new sector(n,m);
                    
                        area=s.area();
                       System.out.println("area of sector is: "+ area);
                      break;
                      
       case 3:     System.out.println("enter radius ");
                      n=sc.nextDouble();
                      System.out.println("enter length");
                      m=sc.nextDouble();
                      segment sg=new segment(n,m);
                      
                      area=sg.area();
                      DecimalFormat dm=new DecimalFormat("#.00");
                      
                       System.out.println("area of sector is "+dm.format(area));
                      break;
       }
    }
    
}
}
