/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;

import java.util.*;

class linkedlist
{ 
    public static void main (String[] args)
  { 
     LinkedList<String> list = new LinkedList<String>();
    Scanner sc = new Scanner (System.in);
    int ch;
    String S;
    do
    { System.out.println("\n********** MAIN MENU ***********");
      System.out.println("1.Insert");
      System.out.println("2.Delete");
      System.out.println("3.Display");
      System.out.println("4.Print names with len < 5");
      System.out.println("5.Exit");
      System.out.println("Enter your choice:");
      ch=sc.nextInt();

      switch(ch)
      {    case 1 : Scanner sc1 = new Scanner (System.in);
		    System.out.println ("Enter the string: ");
                    S= sc1.nextLine();
                    list.add(S);
                    System.out.println("Insert Successful!!");
                    break;
           case 2 : System.out.println("The deleted string is : " + list.remove(0));
                    break;
           case 3 : for (int i=0; i<list.size(); i++)
                    System.out.println(list.get(i));
                    break;
            case 4 : for (int i=0; i<list.size();i++)
                    { 
                      if(list.get(i).length()<5)
                      System.out.println(list.get(i));
                    }
                break;
            case 5:ListIterator itr=list.listIterator();
                
                System.out.println("list is:");
                while(itr.hasNext())
                {
                    String s=(String)itr.next();
                    if(s.length()<5)
                     System.out.println(s);
                }
                break;
               
           case 6: System.exit(0);
           default: System.out.println ("Invalid Choice!!");
                    break;
      }
    }while(ch!=5);
  }
}


