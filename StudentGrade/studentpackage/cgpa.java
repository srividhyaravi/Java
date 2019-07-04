/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main1.studentpackage;
public class cgpa 
{ 
  public int marks[][]=new int [2][4];
   public float sgpa[]=new float[2];
  float cgpa;
   public void printcgpa()
   {
       for(int i=0;i<2;i++)
       {
           System.out.println("Sgpa in sem "+(i+1)+"="+sgpa[i]);
           cgpa+=sgpa[i];
       }
       cgpa=cgpa/2;
       System.out.println("cgpa of student is "+cgpa);
   }
}
