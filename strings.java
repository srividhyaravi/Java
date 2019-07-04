/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;
import java.util.*;
import java.util.regex.*;

public class strings {

    public static void main(String[] args) 
    {
       String s="nidhi";
       String s1="patel";
       String s2="NIDHI";
       String s5="msrit msrit is awesome";
       String s3=s.concat(s1);
       String s4="programming in c++";
       System.out.println("conact:"+s3); 
       System.out.println("are they equal:"+s.equalsIgnoreCase(s2));
       char chars[]=s.toCharArray();
       Arrays.sort(chars);
       String sort=new String(chars);
        System.out.println("rearreanged:"+sort);
        System.out.println("replacement:"+s4.replace("c++","java"));
       Pattern p=Pattern.compile("msrit");
       Matcher m=p.matcher(s5);
       int i=0;
      while(m.find())
      {
          i++;
      }
     System.out.println("word msrit occurs "+i+" times");
     String s6=s5.substring(6,22);
     System.out.println("substring:"+s6);
    }
    
}
