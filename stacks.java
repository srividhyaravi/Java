

package college;
import java.util.Scanner;
  class stacks 
{  
   int size;
    int top;
   
    int s[];
 
   stacks(int n)
    {   size=n;
       this.top=-1;
        this.s=new int[size];
    }
    void push(int ele)
    {
        if(top==size-1)
        {
            System.out.println("stak overfow");
        }
        else
        {
        top=top+1;
        s[top]=ele;        
    }}
    void pop()
    {
        int del;
        if(top==-1)
        {
            System.out.println("stack underflow");
            
        }
       else
        {
        del=s[top];
        top--;
        System.out.println(del);
    }
    }
    void display()
    {
        System.out.println("elements of the stack are");
      
            for(int i=0;i<=top;i++)
            {
               System.out.println(s[i]);
            }
                
        }
    
    

    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the stack");
        int d=sc.nextInt();
        stacks s1=new stacks(d);
         
       int element;
       int ch;
       while(true)
       {
          System.out.println("enter 1 for push,2 for pop,3 for display");
          ch=sc.nextInt();
          switch(ch)
          {
              case 1:        
       System.out.println("entr the elemnent");
     element=sc.nextInt();
      s1.push(element);
      break;
              case 2:
       s1.pop();
       break;
              case 3:
       s1.display();
    break;
          }
    }
    
}

 }