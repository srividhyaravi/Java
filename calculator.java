/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;
 import java.util.Scanner;
public class calculator {

   
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
         int a,b,ans;
         int choice;
         System.out.println("enter 1 for addition , 2 for division ");
         choice=sc.nextInt();
         System.out.println("enter the value of a");
         a=sc.nextInt();
         System.out.println("enter the value of b");
         b=sc.nextInt();
         switch(choice)
         {
             case 1:
                 ans =a+b;
                 System.out.println("the sum is "+ans);
                 break;
                 
             case 2:
                 ans=a/b;
                 System.out.println("the ans is"+ans);
                 break;
                 
             default:
                 System.out.println("enter a valid choice");
         }
    }
    
}
