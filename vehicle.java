/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;
public abstract class vehicle 
{   int year_of_manufacture; 
    vehicle()
            {
                year_of_manufacture=0;
            }
    abstract int getData();
    abstract void putData(int x);
}
class twoWheeler extends vehicle
{
    int getData()
    {
       return year_of_manufacture;    
    }
    void putData(int x)
    {
        year_of_manufacture=x;   
    }
}
final class fourWheeler extends vehicle
{
    int getData()
    {
        return year_of_manufacture;
    }
    void putData(int x)
    {
        year_of_manufacture=x;   
    }
}

class myTwoWheeler extends twoWheeler
{
    void putData(int x)
    {
        super.putData(x);
    }
}
  class main1
  {
    public static void main(String[] args) 
    {
       myTwoWheeler scooter =new myTwoWheeler();
       scooter.putData(2005);
       System.out.println("scooter: "+scooter.getData());
       
       fourWheeler car=new fourWheeler();
       car.putData(2007);
        System.out.println("Car: "+car.getData());        
       
    }
  }

