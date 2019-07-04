
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;
import java.util.Scanner;

public class testbubblesort {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n,flag=0;
        System.out.println("enetr the no");
        n=sc.nextInt();
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                 System.out.println("not a prime no");
                 flag=1;
                 break;
            }
        }
        if(flag==0)
        {
             System.out.println(" is prime");
        }
        }
        
    
}
