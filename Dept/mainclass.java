
package main;
import java.util.Scanner;
import main.*;
import main.ISE.iseDepartment;
public class mainclass 
{  

    public static void main(String[] args) 
    {
        int j;
       int ch,counter=0;
       faculty f[]=new faculty[4];
       String s;
       
       iseDepartment i=new iseDepartment();
       Scanner sc=new Scanner(System.in);
      while(true)
      { 
          boolean flag=false;
          System.out.println("1.enter new profile");
          System.out.println("2.print details");
          System.out.println("3.list of experience faculty");
          System.out.println("4.exit");
          System.out.println("enetr choice");
          ch=sc.nextInt();
          switch(ch)
          {
              case 1:
                  f[counter]=new faculty();
                  i.readdata(f[counter]);
                  counter++;
                  break;
              case 2: System.out.println("enter name");
                      s=sc.next();
                     
                      for( j=0;j<counter;j++)
                      {
                          if(f[j]!=null)
                          {
                              if(s.equals(f[j].name))
                              {
                                  i.printdata(f[j]);
                                  flag=true;
                              }
                          }
                          
                      }
                      if(flag==false)
                          System.out.println("faculty not found");
                      break;
                      
              case 3:
                         
                      for( j=0;j<counter;j++)
                      {
                          if(f[j]!=null)
                          {
                              if(f[j].yearsOfExperience>=20)
                                  i.printdata(f[j]);
                          }
                      }
                          break;
                          
                          case 4: System.exit(0);
                          break;
          }
          
      }
    }
    
}
