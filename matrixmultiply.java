/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;
import java.util.Scanner;
public class matrixmultiply {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int m,n,p,q,i,j,k;
        System.out.println("enter no of rows and column for matrix 1");
        m=sc.nextInt();
        n=sc.nextInt();
        System.out.println("enter no of rows and column of second matrix");
         p=sc.nextInt();
        q=sc.nextInt();
        int m1[][]=new int [m][n];                              
        int m2[][]=new int[p][q];
        if(n==p)
        {
            int m3[][]=new int[m][q];
            System.out.println("enter the elements of matrix1");
            for(i=0;i<m;i++)
                for(j=0;j<n;j++)
                    m1[i][j]=sc.nextInt();
    System.out.println("enetr the elements of matrix2");
        for(i=0;i<p;i++)
                for(j=0;j<q;j++)
                    m2[i][j]=sc.nextInt();
        for(i=0;i<m;i++)
        {
            for(j=0;j<q;j++)
            {
                for(k=0;k<p;k++)
                {
                    m3[i][j]=m3[i][j]+(m1[i][k]*m2[k][j]);
                }
        }
    }
        System.out.println("resltant matrix is");
        for(i=0;i<m;i++)
        {
                for(j=0;j<q;j++)
                {
                    
                   System.out.print(m3[i][j]+" ");
                }
                System.out.println();
        }
       
}
        else
        {
         System.out.println("multiplication not possible");   
        }
    }
}