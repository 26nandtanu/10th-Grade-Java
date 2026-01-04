/*♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪

    File: InvestmentCalculator.java
    Date: Oct 24, 2023
 Purpose: Loop Investment HW
  Period: 4AC   Sauce Code: 3
  Author: Tanushka Nandanapalli

♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪*/

import java.util.Scanner;

public class InvestmentCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //variables
        int years;
        int yearsCalculated = 1;
        double start;
        double rate;
        double interest;
        double end;
        
        //user input
        System.out.println("What is your principal amount (0-10000): ");
        start = input.nextInt();
        System.out.println("What is your interest rate (0-200)%: ");
        rate = input.nextInt();
        System.out.println("How many years are you planning on Investing (0-40): ");
        years = input.nextInt();
        
        //calculate
        while ((start>=0 && start<=10000) && (rate>=0 && rate<=200) && (years>=0 && years<=40)) {
            while (years >= yearsCalculated) {
                interest = start*(rate/100);
                end = start + interest;
                System.out.println("Year\tStart\tEarned\tEnd");
                System.out.println(yearsCalculated + "\t" + (int)start + "\t" + (int)interest + "\t" + (int)end);
                start = end;
                yearsCalculated++;
                    } 
            System.exit(0);
        }
    }

}