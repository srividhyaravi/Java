/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;
import java.util.Scanner;
import java.util.*;

class arraylist
{ 
    public static void main (String[] args)
  { 
      ArrayList<String> Q = new ArrayList<>();
    Scanner sc = new Scanner (System.in);
    int ch;
    String S;
    while(true)
    { System.out.println("\n********** MAIN MENU ***********");
      System.out.println("1.Enqueue");
      System.out.println("2.Dequeue");
      System.out.println("3.Display");
      System.out.println("4.Exit");
      System.out.println("Enter your choice:");
      ch=sc.nextInt();

      switch(ch)
      {    case 1 :// Scanner sc1 = new Scanner (System.in);//
		    System.out.println ("Enter the string: ");
                    S= sc.next();
                    Q.add(S);
                    System.out.println("Enqueue Successful!!");
                    break;
           case 2 : System.out.println("The string dequeued is : " + Q.remove(0));
                    break;
           case 3 : for (int i=0; i<Q.size(); i++)
                    System.out.println(Q.get(i));
                    break;
           case 4 : System.exit(0);
           default: System.out.println ("Invalid Choice!!");
                    break;
      }
    }
  }
}

