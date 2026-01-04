/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author 26nandtanu
 */
public class CurrencyConverter {

    //method
    public static void main(String[] args) {

        //variables
        int enteredNum;
        double firstCurrency1;
        double secondCurrency1;
        double firstCurrency2;
        double secondCurrency2;
        double firstCurrency3;
        double secondCurrency3;
        double firstCurrency4;
        double secondCurrency4;
        double firstCurrency5;
        double secondCurrency5;
        double firstCurrency6;
        double secondCurrency6;
        double firstCurrency7;
        double secondCurrency7;
        double firstCurrency8;
        double secondCurrency8;
        double firstCurrency9;
        double secondCurrency9;
        double firstCurrency10;
        double secondCurrency10;
        double firstCurrency11;
        double secondCurrency11;

        //input
        Scanner input = new Scanner(System.in);

        //get inputs and declare what they are to the program and calculate
        System.out.println("Enter the number the operation you want indicates:");
        System.out.println("""
                        Currency Converter
                        Rates from XE.com
                        9/29/2023
                        0 = Exit
                        1 = USD to GBP
                        2 = USD to EUR
                        3 = USD to Chinese Yuan
                        4 = USD to Mexican Peso
                        5 = USD to BitCoin
                        6 = GBP to USD
                        7 = EUR to USD
                        8 = Chinese Yuan to USD
                        9 = Mexican Peso to USD
                       10 = Bitcoin to USD
                       11 = USD to South Korean WON""");
        enteredNum = input.nextInt();
        
        //use switch within while loop so that it allows it to repeat
        //less than zero or zero will stop the code
        while (enteredNum > 0) {
            switch (enteredNum) {
                case 1 -> {
                    System.out.println("Enter USD amount:");
                    firstCurrency1 = input.nextDouble();
                    secondCurrency1 = firstCurrency1 * 0.82;
                    System.out.println("GBP: " + secondCurrency1);
                    System.out.println("-----------------------------------------------");
                }
                case 2 -> {
                    System.out.println("Enter USD amount:");
                    firstCurrency2 = input.nextDouble();
                    secondCurrency2 = firstCurrency2 * 0.95;
                    System.out.println("EUR: " + secondCurrency2);
                    System.out.println("-----------------------------------------------");
                }
                case 3 -> {
                    System.out.println("Enter USD amount:");
                    firstCurrency3 = input.nextDouble();
                    secondCurrency3 = firstCurrency3 * 7.30;
                    System.out.println("Chinese Yuan: " + secondCurrency3);
                    System.out.println("-----------------------------------------------");
                }
                case 4 -> {
                    System.out.println("Enter USD amount:");
                    firstCurrency4 = input.nextDouble();
                    secondCurrency4 = firstCurrency4 * 17.41;
                    System.out.println("Mexico Peso: " + secondCurrency4);
                    System.out.println("-----------------------------------------------");
                }
                case 5 -> {
                    System.out.println("Enter USD amount:");
                    firstCurrency5 = input.nextDouble();
                    secondCurrency5 = firstCurrency5 * 0.0000372768;
                    System.out.println("BitCoin: " + secondCurrency5);
                    System.out.println("-----------------------------------------------");
                }
                case 6 -> {
                    System.out.println("Enter GBP amount:");
                    firstCurrency6 = input.nextDouble();
                    secondCurrency6 = firstCurrency6 * 1.22;
                    System.out.println("USD: " + secondCurrency6);
                    System.out.println("-----------------------------------------------");
                }
                case 7 -> {
                    System.out.println("Enter EUR amount:");
                    firstCurrency7 = input.nextDouble();
                    secondCurrency7 = firstCurrency7 * 1.06;
                    System.out.println("USD: " + secondCurrency7);
                    System.out.println("-----------------------------------------------");
                }
                case 8 -> {
                    System.out.println("Enter Chinese Yuan amount:");
                    firstCurrency8 = input.nextDouble();
                    secondCurrency8 = firstCurrency8 * 0.14;
                    System.out.println("USD: " + secondCurrency8);
                    System.out.println("-----------------------------------------------");
                }
                case 9 -> {
                    System.out.println("Enter Mexican Peso amount:");
                    firstCurrency9 = input.nextDouble();
                    secondCurrency9 = firstCurrency9 * 0.057;
                    System.out.println("USD: " + secondCurrency9);
                    System.out.println("-----------------------------------------------");
                }
                case 10 -> {
                    System.out.println("Enter Bitcoin amount:");
                    firstCurrency10 = input.nextDouble();
                    secondCurrency10 = firstCurrency10 * 26834.62;
                    System.out.println("USD: " + secondCurrency10);
                    System.out.println("-----------------------------------------------");
                }
                case 11 -> {
                    System.out.println("Enter USD amount:");
                    firstCurrency11 = input.nextDouble();
                    secondCurrency11 = firstCurrency11 * 1349.53;
                    System.out.println("South Korean WON: " + secondCurrency11);
                    System.out.println("-----------------------------------------------");
                }
                default -> {
                    System.out.println("Invalid Input");
                    System.out.println("-----------------------------------------------");
                }
            }
            System.out.println("Enter the number the operation you want indicates:");
            System.out.println("""
                        Currency Converter
                        Rates from XE.com
                        9/29/2023
                        0 = Exit
                        1 = USD to GBP
                        2 = USD to EUR
                        3 = USD to Chinese Yuan
                        4 = USD to Mexican Peso
                        5 = USD to BitCoin
                        6 = GBP to USD
                        7 = EUR to USD
                        8 = Chinese Yuan to USD
                        9 = Mexican Peso to USD
                       10 = Bitcoin to USD
                       11 = USD to South Korean WON""");
            enteredNum = input.nextInt();
        }
    }
}
