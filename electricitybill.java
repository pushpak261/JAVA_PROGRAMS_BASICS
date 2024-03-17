import java.util.Scanner;
import java.util.*;

class electricitybill {             //This class defines a constructor that takes the number of units consumed as a parameter.

    double billpay;

    electricitybill(long units)          //Inside the constructor, it calculates the electricity bill.
    {


    if(units<=50)
         billpay=units*0.50;

    else if(units<100)   
        billpay = units * 1.20;  

    else if(units < 300) 
        billpay = 100 * 1.20 + (units - 100) * 2; 
        
    else if(units > 300)   
            billpay = 100 * 1.20 + 200 * 2 + (units - 300) * 3;  
    

     }

}



class Calculatebill {

    public static void main(String[] args) {
   
    long units;
    System.out.println("enter number of units");
    Scanner sc = new Scanner(System.in);
    units=sc.nextInt();

    electricitybill b = new electricitybill(units);      //It creates an object b of the electricitybill class by passing the units consumed as a parameter to its constructor.

    System.out.println("Bill to pay : " + b.billpay);



    }
    
}
