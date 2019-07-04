/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main1;
import main1.studentpackage.*;

public class mainclass 
{
       public static void main(String[] args)
    {
            registerstudent r=new registerstudent();
            System.out.println("----sem 1---");
            r.register(1);
            r.result();
            System.out.println("----sem 2---");
            r.register(2);
            r.result();
            r.printcgpa();
    }
    
}
