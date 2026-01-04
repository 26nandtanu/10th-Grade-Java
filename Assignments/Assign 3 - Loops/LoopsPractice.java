/*♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪

    File: LoopsPractice.java
    Date: Oct 12, 2023
 Purpose: 
  Author: Tanushka Nandanapalli

♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪*/

 /*
10/16/23
Finished Part 6
Need to continue Part 7 - case 7 in switch statement
 */
import java.util.Scanner; //inputs
import java.util.Random; //randoms
import java.io.IOException; //this and 7 down for playsounds
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class LoopsPractice {

    static Clip ringSnd, arrowSnd, breezeSnd, chimesSnd, coinSnd;

    public LoopsPractice() {
        //one time to load in from disk
        //These files are saved in the project name/build/classes/sounds folder
        InputStream instr = getClass().getClassLoader().getResourceAsStream("sounds/ring01.wav");
        InputStream instr2 = getClass().getClassLoader().getResourceAsStream("sounds/ARROW.wav");
        InputStream instr3 = getClass().getClassLoader().getResourceAsStream("sounds/BREEZE.wav");
        InputStream instr4 = getClass().getClassLoader().getResourceAsStream("sounds/CHIMES.wav");
        InputStream instr5 = getClass().getClassLoader().getResourceAsStream("sounds/COIN.wav");
        try {
            ringSnd = AudioSystem.getClip();
            ringSnd.open(AudioSystem.getAudioInputStream(instr));
            arrowSnd = AudioSystem.getClip();
            arrowSnd.open(AudioSystem.getAudioInputStream(instr2));
            breezeSnd = AudioSystem.getClip();
            breezeSnd.open(AudioSystem.getAudioInputStream(instr3));
            chimesSnd = AudioSystem.getClip();
            chimesSnd.open(AudioSystem.getAudioInputStream(instr4));
            coinSnd = AudioSystem.getClip();
            coinSnd.open(AudioSystem.getAudioInputStream(instr5));
        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException ex) {
            Logger.getLogger(LoopsPractice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void dispAuthor() {
        System.out.println("""
                           ❤❤❤♪♪♪♪❤❤❤♪♪♪❤❤❤
                           //${name}//
                           //${date}//
                           //by Tanushka Nandanapalli//
                           //Java Period 4AC//
                           ❤❤❤♪♪♪♪❤❤❤♪♪♪❤❤❤""");
    }

    public static void playSound1() {
        //to actually play the sounds, we need to set the frame position to the start
        ringSnd.setFramePosition(0);
        ringSnd.start();
    }

    public static void playSound2() {
        //to actually play the sounds, we need to set the frame position to the start
        arrowSnd.setFramePosition(0);
        arrowSnd.start();
    }

    public static void playSound3() {
        //to actually play the sounds, we need to set the frame position to the start
        breezeSnd.setFramePosition(0);
        breezeSnd.start();
    }

    public static void playSound4() {
        //to actually play the sounds, we need to set the frame position to the start
        chimesSnd.setFramePosition(0);
        chimesSnd.start();
    }

    public static void playSound5() {
        //to actually play the sounds, we need to set the frame position to the start
        coinSnd.setFramePosition(0);
        coinSnd.start();
    }

    public static void main(String[] args) {
        new LoopsPractice();
        dispAuthor();
        System.out.println();
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int upperlimit = 6;
        int lowerlimit = 0;
        int choiceSound = rand.nextInt(upperlimit - lowerlimit) - lowerlimit;
        if (choiceSound == 1) {
            playSound1();
        } else if (choiceSound == 2) {
            playSound2();
        } else if (choiceSound == 3) {
            playSound3();
        } else if (choiceSound == 4) {
            playSound4();
        } else {
            playSound5();
        }

        //variables
        int choice; //used in Part 6

        //user input
        System.out.println("Enter the loop that you want to see: ");
        System.out.println("""
                           0 = Exit
                           1 = Loop 1
                           2 = Loop 2
                           3 = Loop 3
                           4 = Loop 4
                           5 = Loop 5
                           6 = Average
                           7 = Probability""");
        choice = input.nextInt();

        while (choice >= 0) {
            switch (choice) {
                case 0 -> {
                    System.exit(0);
                }
                case 1 -> {
                    System.out.println("-------------------------Loop 1-------------------------");
                    int i = 1;
                    while (i <= 16) {
                        System.out.println(i);
                        i = i + 3;
                    }
                }
                case 2 -> {
                    System.out.println("-------------------------Loop 2-------------------------");
                    int u = 20;
                    while (u >= 5) {
                        System.out.println(u);
                        u = u - 5;
                    }
                }
                case 3 -> {
                    System.out.println("-------------------------Loop 3-------------------------");
                    int v = 1;
                    while (v <= 500) {
                        System.out.print("*");
                        v++;
                    }
                    System.out.println();
                    System.out.println();
                }
                case 4 -> {
                    int p = 1;
                    System.out.println("Enter a number: ");
                    int num = input.nextInt();
                    while (num >= p) {
                        System.out.print("*");
                        p++;
                    }
                    System.out.println();
                    System.out.println();
                }
                case 5 -> {
                    int o = 1;
                    System.out.println("Enter a number: ");
                    int loop5 = input.nextInt();
                    while (loop5 >= o) {
                        System.out.println(o);
                        o = o + 2;
                    }
                }
                case 6 -> {
                    int userInput = 0;
                    int numInputs = 0;
                    double sum = 0;
                    while (userInput != -1) {
                        System.out.println("Enter Number, -1 to average");
                        userInput = input.nextInt();
                        if (userInput != -1) {
                            sum = sum + userInput;
                            numInputs++;
                            System.out.println("Sum of Numbers: " + sum + " Numbers so far: " + numInputs);
                        }
                    }
                    double average = sum / numInputs; //calculations
                    average = average * 100; //move the decimal over 2 places
                    average = (int) (average + .5); //add .5 and then chop off decimal
                    average = average / 100; //move the decimal place back
                    System.out.println("--------------------------------------------");
                    System.out.println("Your average is " + average + " for the " + numInputs + " numbers entered.");
                }
                case 7 -> {
                    System.out.println("Enter how many times you want to roll a pair of dice: ");
                    int rollDice = input.nextInt();
                    int rolled = 0;
                    int two = 0;
                    int three = 0;
                    int four = 0;
                    int five = 0;
                    int six = 0;
                    int seven = 0;
                    int eight = 0;
                    int nine = 0;
                    int ten = 0;
                    int eleven = 0;
                    int twelve = 0;
                    while (rolled < rollDice) {
                        int d1 = rand.nextInt(6)+1;
                        int d2 = rand.nextInt(6)+1;
                        switch (d1+d2) {
                            case 2 ->
                                two++;
                            case 3 ->
                                three++;
                            case 4 ->
                                four++;
                            case 5 ->
                                five++;
                            case 6 ->
                                six++;
                            case 7 ->
                                seven++;
                            case 8 ->
                                eight++;
                            case 9 ->
                                nine++;
                            case 10 ->
                                ten++;
                            case 11 ->
                                eleven++;
                            default ->
                                twelve++;
                        }
                        rolled++;
                    }
                    System.out.println("""
                                       Roll     Frequency
                                       ------   --------""");
                    System.out.println("  2         " + two);
                    System.out.println("  3         " + three);
                    System.out.println("  4         " + four);
                    System.out.println("  5         " + five);
                    System.out.println("  6         " + six);
                    System.out.println("  7         " + seven);
                    System.out.println("  8         " + eight);
                    System.out.println("  9         " + nine);
                    System.out.println("  10        " + ten);
                    System.out.println("  11        " + eleven);
                    System.out.println("  12        " + twelve);

                    int equalSign = 0;
                    System.out.print(" 2|   ");
                    while (equalSign < two) {
                        System.out.print("=");
                        equalSign++;
                    }
                    equalSign = 0;
                    System.out.println();
                    System.out.print(" 3|   ");
                    while (equalSign < three) {
                        System.out.print("=");
                        equalSign++;
                    }
                    equalSign = 0;
                    System.out.println();
                    System.out.print(" 4|   ");
                    while (equalSign < four) {
                        System.out.print("=");
                        equalSign++;
                    }
                    equalSign = 0;
                    System.out.println();
                    System.out.print(" 5|   ");
                    while (equalSign < five) {
                        System.out.print("=");
                        equalSign++;
                    }
                    equalSign = 0;
                    System.out.println();
                    System.out.print(" 6|   ");
                    while (equalSign < six) {
                        System.out.print("=");
                        equalSign++;
                    }
                    equalSign = 0;
                    System.out.println();
                    System.out.print(" 7|   ");
                    while (equalSign < seven) {
                        System.out.print("=");
                        equalSign++;
                    }
                    equalSign = 0;
                    System.out.println();
                    System.out.print(" 8|   ");
                    while (equalSign < eight) {
                        System.out.print("=");
                        equalSign++;
                    }
                    equalSign = 0;
                    System.out.println();
                    System.out.print(" 9|   ");
                    while (equalSign < nine) {
                        System.out.print("=");
                        equalSign++;
                    }
                    equalSign = 0;
                    System.out.println();
                    System.out.print("10|   ");
                    while (equalSign < ten) {
                        System.out.print("=");
                        equalSign++;
                    }
                    equalSign = 0;
                    System.out.println();
                    System.out.print("11|   ");
                    while (equalSign < eleven) {
                        System.out.print("=");
                        equalSign++;
                    }
                    equalSign = 0;
                    System.out.println();
                    System.out.print("12|   ");
                    while (equalSign < twelve) {
                        System.out.print("=");
                        equalSign++;
                    }
                    System.out.println();
                }
                default -> {
                    System.out.println("Invalid Input");
                }
            }
            System.out.println("------------------------------------------------");
            System.out.println("Enter the loop that you want to see: ");
            System.out.println("""
                           0 = Exit
                           1 = Loop 1
                           2 = Loop 2
                           3 = Loop 3
                           4 = Loop 4
                           5 = Loop 5
                           6 = Average
                           7 = Probability""");
            choice = input.nextInt();
        }
    }
}
