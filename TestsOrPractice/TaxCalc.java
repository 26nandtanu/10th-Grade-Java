/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 26nandtanu
 */
import java.util.Scanner;   //import statements access java libraries
import java.text.DateFormat;
import java.util.Date;

public class TaxCalc {  //TaxCalc -> name must match filename
    
    //method
    public static void main(String[] args) {

        Date now = new Date();
        String display = DateFormat.getDateTimeInstance(DateFormat.LONG,
                DateFormat.LONG).format(now);
        System.out.println(display);
        //1. Declare Variables - inputs
        double grossIncome; //amount earned per year
        int numDependents;  //number of dep for tax reduction
        //outputs
        double taxableIncome;   //amount after exemptions
        double incomeTax;   //amount owed
        
        //2. Make a Scanner object to read the keyboard
        Scanner input = new Scanner(System.in);
        
        //3. Prompt and gather inputs
        System.out.println("Hello, I will estimate taxes owed");
        System.out.println("Please enter income");
        grossIncome = input.nextInt();
        
        System.out.println("Please enter # dependents");
        numDependents = (int) input.nextDouble();
        
        //4. Do da math
        taxableIncome = grossIncome - 10000 - numDependents * 2000;
        
        incomeTax = taxableIncome * .20;
        
        incomeTax = Math.round(incomeTax);  //rounds off to the nearest dollar
        
        //5. Print out the answers
        System.out.println("-----------------------------");
        System.out.println("OK");
        System.out.println("Here is what you owe");
        System.out.println("Taxes = " + incomeTax);
    }//ends main method
}//ends class
