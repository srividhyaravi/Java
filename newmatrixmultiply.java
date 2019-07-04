/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;

import java.util.Scanner;
public class matrixmultiply 
{
    int m,n,p,q,i,j,k;
    int m1[][];
    int m2[][];
    int m3[][];
  static  Scanner sc=new Scanner(System.in);
    matrixmultiply(int m,int n,int p,int q)
    {
        this.m=m;
        this.n=n;
        this.p=p;
        this.q=q;
        
    }
    void insert()
    {
        if(n==p)
        {
              m1=new int [m][n];                              
       m2=new int[p][q];
         m3=new int[m][q];
            System.out.println("enter the elements of matrix1");
            for(i=0;i<m;i++)
                for(j=0;j<n;j++)
                    m1[i][j]=sc.nextInt();
    System.out.println("enetr the elements of matrix2");
        for(i=0;i<p;i++)
                for(j=0;j<q;j++)
                    m2[i][j]=sc.nextInt();
        }
    }
void multiply()
{
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
}

void display()
{
        System.out.println("resultant matrix is");
        for(i=0;i<m;i++)
        {
                for(j=0;j<q;j++)
                {
                    
                   System.out.print(m3[i][j]+" ");
                }
                System.out.println();
        }

}
    public static void main(String[] args) 
    {
        
        int u,v,w,x;
        System.out.println("enter no of rows and column for matrix 1");
        u=sc.nextInt();
        v=sc.nextInt();
        System.out.println("enter no of rows and column of second matrix");
         w=sc.nextInt();
        x=sc.nextInt();
        matrixmultiply n=new matrixmultiply(u,v,w,x);
        n.insert();
        n.multiply();
        n.display();
    }
    
}
