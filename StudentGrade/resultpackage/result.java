
package main1.resultpackage;
import java.util.Scanner;
import main1.studentpackage.*;
public class result extends cgpa 
{
    char grade[][]=new char[2][4];
    public int credits[]=new int[4];
    public int semester,totalcredits;
    public String name,branch;
    public String subjects[]=new String[4];
    
    public void result()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks in "+subjects[0]);
        marks[semester-1][0]=sc.nextInt();
          System.out.println("enter marks in "+subjects[1]);
        marks[semester-1][1]=sc.nextInt();
          System.out.println("enter marks in "+subjects[2]);
        marks[semester-1][2]=sc.nextInt();
          System.out.println("enter marks in "+subjects[3]);
        marks[semester-1][3]=sc.nextInt();
        int t=0;
        for(int i=0;i<4;i++)
        {
            if(marks[semester-1][i]>90)
                grade[semester-1][i]='s';
            else if(marks[semester-1][i]>75)
                grade[semester-1][i]='a';
            else if(marks[semester-1][i]>55)
                grade[semester-1][i]='b';
            else
                grade[semester-1][i]='c';
        }
        
        for(int i=0;i<4;i++)
        {
            if(grade[semester-1][i]=='s')
               sgpa[semester-1]+=credits[i]*10;
          else  if(grade[semester-1][i]=='a')
               sgpa[semester-1]+=credits[i]*9;
          else if(grade[semester-1][i]=='b')
               sgpa[semester-1]+=credits[i]*8;
            else
              sgpa[semester-1]+=credits[i]*7;
              
       }    
        sgpa[semester-1]=sgpa[semester-1]/totalcredits;
        
        try
        {
            if(sgpa[semester-1]>10)
                throw new Exception("invaild sgpa");
        }
        catch(Exception e)
        {
            System.out.println("SGPA is invailid");
        }
        //System.out.println("SGPA is : "+sgpa[semester-1]);
    }
}
