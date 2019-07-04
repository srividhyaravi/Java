/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;

/**
 *
 * @author Nidhi Patel_2
 */
public class recursion {
 public void dosomething(int n)
 {
     if(n>0)
     {
         dosomething(n-1);
         System.out.println(n);
         dosomething(n-1);
 }
 }
    public static void main(String[] args) 
    {
      recursion r=new recursion();
      r.dosomething(3);
       
    }
    
}
