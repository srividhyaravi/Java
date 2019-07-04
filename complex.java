/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;
import java.util.Scanner;
 
 class complex 
{
    float a,b;
    float a1,b1;
    float ans;
    float result1;
    float result2;
   complex(float a,float b,float a1,float b1)
    {
        this.a=a;
        this.b=b;
        this.a1=a1;
        this.b1=b1;
    }
  void add()
  {
      result1=a1+a;
      result2=b+b1;
      System.out.println(" the sum is "+result1+"+"+"i"+"("+result2+")");
      
  }
void multiply()
{
    result1=(a*a1)-(b*b1);
    result2=(b*a1)+(a*b1);
    System.out.println("product is :"+result1+"+"+"("+result2+")"+"i");
}
     void difference()
     {
         result1=a-a1;
         result2=b-b1;
         System.out.println("difference is :"+result1+"+"+"("+result2+")"+"i");
     }
public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter real part");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("enter img part");
         int p=sc.nextInt();
        int q=sc.nextInt();
        
        complex c=new complex(m,n,p,q);
        c.add();
        c.difference();
        c.multiply();
         
    }
    
}
