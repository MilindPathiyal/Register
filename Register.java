//Milind Pathiyal


import java.util.*;
public class Register
{
    public void calculate()
    {
        //Enter PurchasePrice/CashGiven
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Purchase Price");
        double purchasePrice = input.nextDouble();
        System.out.println("Enter Cash Given");
        double cashGiven = input.nextDouble();
        
        //Money Calculation
        double result = cashGiven - purchasePrice;
        result = (int) (result * 100 + .1);
        result = result / 100;
        int dollar = (int) result;
        double a = result - dollar;
        double cent = (double) Math.round(a * 100) ;
        int cents = (int) cent;
        
        //Coin Amount
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;
        
        //Coin Calculation
        int totalQuarter = (int)(cent / quarter);
        cent %= quarter;
        int totalDime = (int)(cent / dime);
        cent %= dime;
        int totalNickel = (int)(cent / nickel);
        cent %= nickel;
        int totalPenny = (int)(cent / penny);
        cent %= penny;
 
        //Final Output
        System.out.println("$" + result);
        System.out.println("The customer will recieve " + 
        dollar + " dollars and " + cents + " cents");
        System.out.println("This is " + totalQuarter + " quarters");
        System.out.println("This is " + totalDime + " dimes");
        System.out.println("This is " + totalNickel + " nickels");
        System.out.println("This is " + totalPenny + " pennies");
    }
}
