/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;
import java.util.Scanner;
 
public class fibanocci 
{
    public static void main(String[] args) 
    {
        int a=0,b=0,c=1;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements in the sequence");
        n=sc.nextInt();
        System.out.println("the fibanocci series is ");
        for(int i=1;i<=n;i++)
        {
            a=b;
            b=c;
            c=a+b;
            System.out.println(a);
        }
        
    }
    
}
