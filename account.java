/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;
import java.util.Scanner;
 
class account
{
    int accno,phoneno;
    String name;
    float balance;
    Scanner sc=new Scanner(System.in);
     account(float balance)
    {
        this.balance=balance;
    }
     
   public void getinput()
   {
       System.out.println("enter name ,phone no and accno");
       accno=sc.nextInt();
       name=sc.next();
       phoneno=sc.nextInt();
   }
    public void withdraw()
    {
        float with;
        System.out.println("enter ur withdraw amount");
        with=sc.nextInt();
         if(balance<with)
         {
             System.out.println("enter valid amount");
             
         }
          balance=balance-with;
        System.out.println("ur balance now is"+balance);
       
    }
    public void deposit()
    {
        float amount;
        System.out.println("enter the amount");
        amount=sc.nextFloat();
        balance=balance+amount;
       System.out.println("now ur balance is ="+balance);
    }
 
    public static void main(String[] args) 
    {
        
        account a=new account(100000);
        a.getinput();
        System.out.println("name:"+a.name+"phoneno:"+a.phoneno+"accno:"+a.accno);
        a.withdraw();
        
        
    }
    
}
