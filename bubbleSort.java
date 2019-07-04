/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;

import java.util.Scanner;

public class bubbleSort{
    public static void main(String[] args) 
    {Scanner sc=new Scanner(System.in);
         System.out.println("enter the size of array");
         int n=sc.nextInt();
      int a[]=new int[n];
      int i,j;
       System.out.println("enter elements of the array");
       
       for(i=0;i<n;i++)
           a[i]=sc.nextInt();
      
       for(i=0;i<n;i++)
       {
         for(j=0;j<n-1-i;j++)
         {
             if(a[j]>a[j+1])
             {
                 int temp=a[j];
                 a[j]=a[j+1];
                 a[j+1]=temp;
             }
         }
       }
    }
}

