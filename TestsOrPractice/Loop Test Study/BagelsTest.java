/*♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪

    File: BagelsTest.java
    Date: Nov 16, 2023
 Purpose: 
  Author: Tanushka Nandanapalli

♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪*/

import java.util.Scanner;

public class BagelsTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //variables
        int numBagels;
        int numBagelsPrinted = 1;

        //get inputs
        System.out.println("How many Bagels: ");
        numBagels = input.nextInt();

        //print out 
        if (numBagels == -1) {
            System.exit(0);
        } else {
            while (numBagels != -1) {
                while (numBagels >= numBagelsPrinted) { //this prints out your loop
                    if (numBagelsPrinted % 12 == 0) { //prints 12 unitl there are remainders less than 12
                        System.out.print("O ");
                        System.out.println();
                        numBagelsPrinted++;
                    } else {
                        System.out.print("O "); //print the single donuts
                        numBagelsPrinted++;
                    }
                }
                numBagelsPrinted = 1; //resets the Bagels Printed because if we don't it will start from the number it ended before, ex: you do 15, it only prints out 15-12=3, 12-3=9 times.
                System.out.println();
                System.out.println("How many Bagels: ");
                numBagels = input.nextInt();
            }
        }
    }
}
