/*♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪

    File: FamilyBudget.java
    Date: Nov 29, 2023
 Purpose: To 
  Author: Tanushka Nandanapalli

♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪*/

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

public class FamilyBudget {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        // sample budget 1
        String[] sampCat1 = new String[15];
        int[] sampAmt1 = new int[15];
        // populate the sample array 1
        sampCat1[0] = "*FIT";
        sampAmt1[0] = 480;
        sampCat1[1] = "NYS";
        sampAmt1[1] = 240;
        sampCat1[2] = "SS";
        sampAmt1[2] = 300;
        sampCat1[3] = "***Mortgage";
        sampAmt1[3] = 1200;
        sampCat1[4] = "*Food";
        sampAmt1[4] = 500;
        sampCat1[5] = "*Auto Insurance";
        sampAmt1[5] = 80;
        sampCat1[6] = "Auto Payment";
        sampAmt1[6] = 300;
        sampCat1[7] = "Student Loan";
        sampAmt1[7] = 200;
        sampCat1[8] = "Investment";
        sampAmt1[8] = 200;
        sampCat1[9] = "Heat/Electric";
        sampAmt1[9] = 250;
        sampCat1[10] = "Cable/Phone/Internet";
        sampAmt1[10] = 130;
        sampCat1[11] = "Mobile Phone";
        sampAmt1[11] = 80;
        sampCat1[12] = "Misc";
        sampAmt1[12] = 40;

        // sample budget 2
        String[] sampCat2 = new String[15];
        int[] sampAmt2 = new int[15];
        // populate the sample array 2
        sampCat2[0] = "*FIT";
        sampAmt2[0] = 360;
        sampCat2[1] = "NYS";
        sampAmt2[1] = 180;
        sampCat2[2] = "SS";
        sampAmt2[2] = 225;
        sampCat2[3] = "**Rent";
        sampAmt2[3] = 750;
        sampCat2[4] = "*Food";
        sampAmt2[4] = 500;
        sampCat2[5] = "*Auto Insurance";
        sampAmt2[5] = 80;
        sampCat2[6] = "Dog Food";
        sampAmt2[6] = 30;
        sampCat2[7] = "Entertainment";
        sampAmt2[7] = 120;
        sampCat2[8] = "*Savings";
        sampAmt2[8] = 300;
        sampCat2[9] = "World of Worldcraft";
        sampAmt2[9] = 14;
        sampCat2[10] = "Cable/Phone/Internet";
        sampAmt2[10] = 130;
        sampCat2[11] = "Mobile Phone";
        sampAmt2[11] = 80;
        sampCat2[12] = "Auto Repair";
        sampAmt2[12] = 200;
        sampCat2[13] = "Misc";
        sampAmt2[13] = 69;

        // actual budget
        String[] actuCat = new String[15];
        double[] actuAmt = new double[15];

        // variables
        double monthly = 0;

        while (true) {
            System.out.println("-----------------------------------");
            System.out.println("1 = Sample Budget 1");
            System.out.println("2 = Sample Budget 2");
            System.out.println("3 = Enter Actual Budget");
            System.out.println("4 = Display Actual Budget");
            System.out.println("5 = Clear Actual Budget");
            System.out.println("6 = Exit");
            System.out.println("7 = Load Budget from Disk");
            System.out.println("8 = Save Budget to Disk");
            System.out.println("9 = Pie Chart");
            System.out.println("-----------------------------------");
            int choice = input.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("**************************************");
                    System.out.println("Here is your Budget for $4000 monthly");
                    System.out.println("Item#\tAmount\tCategory");
                    System.out.println("-----\t------\t--------");
                    int i = 0;
                    while (i < 15) {
                        System.out.println(i + 1 + "\t" + sampAmt1[i] + "\t" + sampCat1[i]);
                        i++;
                    }
                }
                case 2 -> {
                    System.out.println("**************************************");
                    System.out.println("Here is your Budget for $3000 monthly");
                    System.out.println("Item#\tAmount\tCategory");
                    System.out.println("-----\t------\t--------");
                    int i = 0;
                    while (i < 15) {
                        System.out.println(i + 1 + "\t" + sampAmt2[i] + "\t" + sampCat2[i]);
                        i++;
                    }
                }
                case 3 -> {
                    System.out.println("**************************************");
                    System.out.println("How much do you earn annually?");
                    double anually = input.nextDouble();
                    monthly = Math.round(anually / 12);
                    actuCat[0] = "FIT";
                    actuAmt[0] = Math.round(.12 * monthly);
                    actuCat[1] = "NYS";
                    actuAmt[1] = Math.round(.06 * monthly);
                    actuCat[2] = "SS";
                    actuAmt[2] = .075 * monthly;

                    double leftover = monthly - (actuAmt[0] + actuAmt[1] + actuAmt[2]);
                    System.out.println("Your monthly salary is " + monthly);
                    System.out.println("Item\tAmount\tCategory");
                    System.out.println("-----\t------\t--------");
                    System.out.println(1 + "\t" + (int) actuAmt[0] + "\t" + actuCat[0]);
                    System.out.println(2 + "\t" + (int) actuAmt[1] + "\t" + actuCat[1]);
                    System.out.println(3 + "\t" + (int) actuAmt[2] + "\t" + actuCat[2]);
                    System.out.println(leftover + " left");

                    int item = 3;
                    while (item < 14) { // reserve 14 for the Miscellaneous
                        System.out.println("Enter category name or q to quit");
                        input.skip("\n");
                        String tempCat = input.nextLine(); // reads including spaces
                        if (tempCat.equals("q")) {
                            break; // exits loop
                        }
                        actuCat[item] = tempCat;
                        System.out.println("Enter amount for category " + tempCat);
                        actuAmt[item] = input.nextDouble();

                        leftover = leftover - actuAmt[item];
                        System.out.println(leftover + " left");
                        item++;
                    }
                    actuCat[item] = "Misc";
                    actuAmt[item] = leftover;
                }
                case 4 -> {
                    System.out.println("**************************************");
                    System.out.println("Display Actual Budget");
                    System.out.println("Item #\tAmount\tCategory");
                    for (int i = 0; i < 15; i++) {
                        if (actuAmt[i] >= monthly * 0.3) {
                            System.out.println((i + 1) + "\t" + actuAmt[i] + "\t***" + actuCat[i]);
                        } else if (actuAmt[i] >= monthly * 0.2) {
                            System.out.println((i + 1) + "\t" + actuAmt[i] + "\t**" + actuCat[i]);
                        } else if (actuAmt[i] >= monthly * 0.1) {
                            System.out.println((i + 1) + "\t" + actuAmt[i] + "\t*" + actuCat[i]);
                        } else {
                            System.out.println((i + 1) + "\t" + actuAmt[i] + "\t" + actuCat[i]);
                        }
                    }
                }
                case 5 -> {
                    System.out.println("**************************************");
                    for (int i = 0; i < 15; i++) {
                        actuCat[i] = null;
                        actuAmt[i] = 0;
                    }
                    System.out.println("Cleared Budget");
                }
                case 6 -> {
                    System.out.println("**************************************");
                    System.out.println("");
                    System.out.println("Thank you for using this program!!");
                    System.out.println("See you next time~~!!");
                    System.out.println("");
                    System.out.println("**************************************");
                    System.exit(0);
                }
                case 7 -> {
                    try (Scanner sc = new Scanner(new FileReader("FamilyBudget.txt"))) {
                        monthly = sc.nextDouble();
                        for (int i = 0; sc.hasNext(); i++) {
                            actuAmt[i] = sc.nextDouble();
                            sc.skip("\n");
                            actuCat[i] = sc.nextLine();
                        }
                    }
                    System.out.println("Loaded from FamilyBudget.txt");
                }

                case 8 -> {
                    try {
                        try (BufferedWriter writer = new BufferedWriter(new FileWriter("FamilyBudget.txt"))) {
                            writer.write(monthly + "\n");
                            for (int i = 0; i < 15; i++) {
                                writer.write(actuAmt[i] + "\n" + actuCat[i] + "\n");
                            }
                            writer.close();
                        }

                    } catch (IOException e) {
                        System.out.println("Could not find file");
                    }
                    System.out.println("Saved to FamilyBudget.txt");
                }
                case 9 -> {
                    
                }
                default -> {
                    System.out.println("Invalid Input");
                }
            }
        }
    }
}
