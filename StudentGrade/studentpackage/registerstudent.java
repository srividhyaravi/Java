
package main1.studentpackage;
import java.util.Scanner;
import main1.resultpackage.*;
interface student
{
    void setname();
    void setbranch();
}
public class registerstudent extends result implements student 
{   Scanner sc=new Scanner(System.in);
    public void setname()
    {
        System.out.println("enter anme: ");
        name=sc.next();
     }
    public void setbranch()
    {
        System.out.println("enter branch: ");
        branch=sc.next();
    }
    public void register(int sem)
    {
        semester =sem;
        if(sem==1)
        {
            setname();
            setbranch();
        }
        System.out.println("enter the subject registered: ");
        for(int i=0;i<4;i++)
        {
            subjects[i]=sc.next();
        }
        totalcredits=0;
        System.out.println("enter their respective credits: ");
        for(int i=0;i<4;i++)
        {
            credits[i]=sc.nextInt();
            totalcredits+=credits[i];
        }
        if(totalcredits>30)
        {
            System.out.println("credits cannot exceed 30");
            throw new java.lang.Error("credits cannot exceed 30");
        }
    }
    
}
