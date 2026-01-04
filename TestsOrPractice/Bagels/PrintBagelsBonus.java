/*♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪

    File: PrintBagelsBonus.java
    Date: Nov 27, 2023
 Purpose: 
  Author: Tanushka Nandanapalli

♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪*/

import java.util.Scanner;

public class PrintBagelsBonus {
//do when you have time
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //variables
        int numBagels;
        int numBagelsPrinted = 0;

        //get inputs
        System.out.println("Please enter number of bagels > 0, -1 to quit");
        numBagels = input.nextInt();

        //print out
        while (numBagels != -1) {
            if (numBagels == -1) {
                System.exit(0);
            } else {
                while (numBagels >= numBagelsPrinted) {
                    int r = 0;
                    while(r==numBagelsPrinted){
                        int c=0;
                        while(c<=12){
                        System.out.print("O ");
                        c++;
                        numBagelsPrinted++;
                        }
                        r++;
                        System.out.println("");
                    }
                    System.out.println("");
                    System.out.println("Please enter number of bagels > 0, -1 to quit");
                    numBagels = input.nextInt();
                }
            }
        }

    }
}
