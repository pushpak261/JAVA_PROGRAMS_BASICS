

// Program is designed to calculate the amount after applying a discount to a marked price.

import java.util.Scanner;


class discountonproduct {
    public static void main(String[] args) {
        double dis, amount, markedprice, amoun;

        System.out.println("Enter marked price: ");  
        Scanner sc = new Scanner(System.in);
        markedprice = sc.nextDouble();

        System.out.println("Enter discount percentage: ");   
        dis = sc.nextDouble();   


        amoun = (100 - dis)/100;

        amount = amoun * markedprice;

        System.out.println("Amount after Discount is : " +amount);



    }
    
}
