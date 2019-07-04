/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ISE;
import main.*;
import java.util.Scanner;
public class iseDepartment implements department 
{
    public void readdata(faculty f)
    {
        int tempage;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name : ");
        f.name=sc.next();
        System.out.print("enter age : ");
        tempage=sc.nextInt();
        if(tempage<=58)
        {
            f.age=tempage;
        }
        else
        {
            throw new java.lang.Error("age exception");
        }
        System.out.print("enter designation");
        f.designation=sc.next();
        System.out.println("enter years of experience");
        f.yearsOfExperience=sc.nextInt();
        System.out.println("enter joining date ");
        f.joiningDate=sc.next();
        System.out.print("enter subject to be handled ");
        f.subjectHandled=sc.next();
    }
        
        public void printdata(faculty f)
      {    System.out.println("name "+f.name);
            System.out.println("age "+f.age);   
              System.out.println("designation "+f.designation);
                System.out.println("joining date "+f.joiningDate);
                  System.out.println("subject handled "+f.subjectHandled);
       }
    }
    

