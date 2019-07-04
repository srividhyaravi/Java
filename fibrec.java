/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;

import java.util.Scanner;

public class fibrec {
     int fib(int m)
    {
        if(m==0||m==1)
            return m;
        else
            return fib(m-1)+fib(m-2);
        
    }
    
    
    
 
    public static void main(String[] args) 
    {
        fibrec t=new fibrec();
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter the range");
        n=sc.nextInt();
         System.out.println("fib sequence is");
        for(int i=0;i<n;i++)
         System.out.println(t.fib(i));
    }
}
