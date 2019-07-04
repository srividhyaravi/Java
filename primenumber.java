/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;
import java.util.Scanner;
 
public class primenumber {
 
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no");
        int n=sc.nextInt();
        for(int i=2;i<=n;i++)
        {
            if(n==2)
            {
                System.out.println("its a prime no");
                break;
            }
       
        if(n%2==0)
        {
            System.out.println("not a prime no");
            break;
        }
        else
        {
            System.out.println("its a prime no");
            break;
        }
        }
         
    }
    
}
