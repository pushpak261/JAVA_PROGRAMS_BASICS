

// 4!= 4*3*2*1=24

import java.util.Scanner;     //The Scanner class is used to take user input from the console.

class factorial{                // In Java, every executable program needs to be defined within a class.
    public static void main(String[] arg) {                   //This is the entry point of the program. It's a method named main, which is public, static, and returns void (i.e., it doesn't return any value). It takes an array of strings as an argument (though you've named it arg).
        
        int fact;
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);               //Creates a new Scanner object named sc to read input from the console.
        fact = sc.nextInt();                                  //sc.nextInt() reads the next integer entered by the user and assigns it to the fact variable.
        
         
        int n = 1;                                         //Initializes an integer variable n to 1. This variable will hold the factorial value.
  
        for(int i=1;i<=fact;i++)                                      //Uses a for loop to calculate the factorial.The loop starts from 1 and continues until it reaches the value of fact.In each iteration, n is multiplied by the loop variable i.This effectively calculates the factorial of fact.
        {
                   n=n*i;   
        }

          System.out.println("Factorial of "+fact+" is "+n+".");

          sc.close();
        



    }
}