
 
package college;
import java.util.Scanner;
public class personal 
{
    String name,education;
   int age,yearsOfExperience,noOfLoans;
   float salary,basic,da,hra,loanAmount,tax;
   
   personal(String name,String education,int age,int yearsOfExperience,int noOfLoans,float loanAmount,float salary,float basic)
   {
       this.name=name;
       this.education=education;
       this.age=age;
       this.yearsOfExperience=yearsOfExperience;
       this.noOfLoans=noOfLoans;
       this.noOfLoans=noOfLoans;
       this.loanAmount=loanAmount;
       this.salary=salary;
       this.basic=basic;
   }
   
   void loanEligible()
   {
      if(age>=18 && yearsOfExperience>2 && noOfLoans<2 && salary>20000)
      {
          System.out.println("eligible for loan");
       }
      else
          System.out.println("not eligible for loan");
   }
   
   void taxPay()
   {
       da=(basic/100)*25;
       hra=(basic/100)*2;
       tax=basic-da-hra;
       System.out.println("tax to pay is "+tax);
   }
   
   void isPromotionEligible()
   {
       if(yearsOfExperience>5)
           System.out.println("eligible for prmotion");
       else
           System.out.println("not eligible for promotion");
   }
   
   void display()
   {
       System.out.println("name: "+name);
        System.out.println("age: "+age);
         System.out.println("education: "+education);
          System.out.println("tax: "+tax);
       
   }
  public static void main(String[] args) 
    {    String name,education;
   int age,yearsOfExperience,noOfLoans;
   float salary,basic,da,hra,loanAmount;
       int n;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the no of employees");
       n=sc.nextInt();
     
       personal p[]=new personal[n];
     int counter=0;
       while(true)
       {     boolean flag=false;
           System.out.println("1.new profile");
           System.out.println("2.loan eligibility");
            System.out.println("3.tax pay");
             System.out.println("4.promotion eligiblty");
             System.out.println("5.display details");
             int ch=sc.nextInt();
             
             
             switch(ch)
             {
                 case 1:
                     if(counter==n)
                     {
                         System.out.println("no employees acn be added");
                     }
                     
                     else
                     {
                         System.out.println("name: ");
                         name=sc.next();
                         System.out.println("age:");
                         age=sc.nextInt();
                          System.out.println("education:");
                          education=sc.next();
                           System.out.println("years of experence:");
                           yearsOfExperience=sc.nextInt();
                            System.out.println("no of loans:");
                            noOfLoans=sc.nextInt();
                             System.out.println("loan amount:");
                             loanAmount=sc.nextFloat();
                             System.out.println("salary:");
                             salary=sc.nextFloat();
                              System.out.println("basic:");
                              basic=sc.nextFloat();
                              
                p[counter++]=new personal(name,education,age,yearsOfExperience,noOfLoans,loanAmount,salary,basic);
            
                System.out.println("profile added successfuly");
                     }
                      break;
                      
                      case 2:   System.out.println("enter name");
                                name=sc.next();
                                for(int i=0;i<counter;i++)
                                {
                                   if(name.equals(p[i].name))
                                   {
                                      p[i].loanEligible();
                                      flag=true;
                                      break;
                                   }
                                   
                                 }
                                if(flag==false)
                                    System.out.println("employee not found");
                                break;
                      case 3:   System.out.println("enter name");
                                name=sc.next();
                                for(int i=0;i<counter;i++)
                                {
                                   if(name.equals(p[i].name))
                                   {
                                      p[i].taxPay();
                                      flag=true;
                                      break;
                                   }
                                   
                                 }
                                if(flag==false)
                                    System.out.println("employee not found");
                                break;
                                
                      case 4:  System.out.println("enter name");
                                name=sc.next();
                                for(int i=0;i<counter;i++)
                                {
                                   if(name.equals(p[i].name))
                                   {
                                      p[i].isPromotionEligible();
                                      flag=true;
                                      break;
                                   }
                                   
                                 }
                                if(flag==false)
                                    System.out.println("employee not found");
                                break;
                                
                      case 5:   System.out.println("enter name");
                                name=sc.next();
                                for(int i=0;i<counter;i++)
                                {
                                   if(name.equals(p[i].name))
                                   {
                                      p[i].display();
                                      flag=true;
                                      break;
                                   }
                                   
                                 }
                                if(flag==false)
                                    System.out.println("employee not found");
                      break;
                              
                                
                      case 6:System.exit(0);
             }
       }
    }       
       
    
    
    
}














