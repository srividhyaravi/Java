/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;
import java.util.Scanner;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class newstring 
{
    static Scanner sc=new Scanner(System.in);
    void concatinate()
    {
        System.out.println("enter string1");
        String s1=sc.next();
         System.out.println("enter string2");
        String s2=sc.next();
        String s3=s1.concat(s2);
        System.out.println(s3);
    }
    
    void ignorecase()
    {
        System.out.println("enter string1");
        String s1=sc.next();
         System.out.println("enter string2");
        String s2=sc.next();
        System.out.println("are they equal:"+s1.equalsIgnoreCase(s2));
    }
    
    void replace()
    {
        System.out.println("enter text ");
                sc.nextLine();
        String s1=sc.nextLine();
       
        System.out.println("enter new word");
        String s2=sc.next();
          System.out.println("enter new word ");
        String s3=sc.next();
        System.out.println(s1.replaceFirst(s2,s3));
        
    }
    
    
    void reaarrange()
    {
          System.out.println("enter string1");
        String s1=sc.next();
        char chars[]=s1.toCharArray();
        Arrays.sort(chars);
        String sorted=new String(chars);
        System.out.println("after reaaranging:"+sorted);
    }
    
    void occur()
    {
        int i=0;
          System.out.println("enter string1");
          sc.nextLine();
        String s5=sc.nextLine();
        System.out.println("nter the word");
        String s2=sc.next();
        Pattern p=Pattern.compile(s2);
        Matcher m=p.matcher(s5);
        while(m.find())
        {
            i++;
        }
        System.out.println("thw word "+s2+" occurs "+i+" times ");
    }
    
    void substring()
    {
        System.out.println("enter string");
        sc.nextLine();
        String s1=sc.nextLine();
        System.out.println("enter start and end point");
        int s=sc.nextInt();
        int e=sc.nextInt();
        String s2=s1.substring(s,e);
        System.out.println(s2);
    }
        
    
    public static void main(String[] args) 
    {
        newstring s=new newstring();
       int ch;
       System.out.println("1 for conact 2 for ignorecase,3 for replace,4 for rearrange,5 for occurence,6 for substring");
       ch=sc.nextInt();
     while(true)
     {
       switch(ch)
       {
           case 1: s.concatinate();
           break;
           case 2:
               s.ignorecase();
               break;
           case 3: s.replace();
           break;
           case 4: s.reaarrange();
           break;
           case 5:s.occur();
           break;
           case 6:s.substring();
           break;
           
       }
       
    }
    }
}
