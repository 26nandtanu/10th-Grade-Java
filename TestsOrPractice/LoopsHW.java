/*♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪

    File: LoopsHW.java
    Date: Nov 9, 2023
 Purpose: 
  Author: Tanushka Nandanapalli

♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪❤❤❤♪♪♪*/

import java.util.Scanner;

public class LoopsHW {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the loop that you want to see: ");
        System.out.println("""
                           0 = Exit
                           1 = Practice 7
                           2 = Practice 8
                           3 = Practice 9
                           4 = Practice 10
                           5 = Practice 11
                           6 = Practice 12""");
        int choice = input.nextInt();

        while (choice > 0) {
            if (choice == 0) {
                System.exit(0);
            } else if (choice == 1) {
                System.out.println("Practice 7");
                int r = 0;
                while (r < 3) {
                    int c = 0;
                    while (c < 4) {
                        System.out.print("*");
                        c++;
                    }
                    System.out.println();
                    r++;
                }
            } else if (choice == 2) {
                System.out.println("Practice 8");
                int r = 0;
                while (r < 6) {
                    int c = 0;
                    while (c < 4) {
                        if (r % 2 == 0) {
                            System.out.print("^");
                        } else {
                            System.out.print("*");
                        }
                        c++;
                    }
                    r++;
                    System.out.println();
                }
                System.out.println();
            } else if (choice == 3) {
                System.out.println("Practice 9");
                System.out.println("Enter size or 0 to exit");
                int size = input.nextInt();
                while (size != 0) {
                    int r = 0;
                    while (r < size) {
                        int c = 0;
                        while (c < size) {
                            if (r == 0 || r == size - 1 || c == 0 || c == size - 1) {
                                System.out.print("&");
                            } else {
                                System.out.print(" ");
                            }
                            c++;
                        }
                        r++;
                        System.out.println();
                    }
                    System.out.println("Enter size: ");
                    size = input.nextInt();
                }
            } else if (choice == 4) {
                System.out.println("Practice 10");
                int[][] maze = new int[10][10]; //creates a 2d array of 100 ints, 0 is default value
                final int WALL = 1; //made up a code that represents a wall
                final int DOOR = 2; //door you can pass through
                //commands to place walls and doors
                maze[3][3] = WALL;
                maze[4][3] = WALL;
                maze[5][3] = WALL;
                maze[2][4] = WALL;
                maze[5][4] = WALL;
                maze[2][5] = WALL;
                maze[3][5] = DOOR;
                maze[4][5] = WALL;
                maze[5][5] = WALL;
                //display maze content 
                int r = 0;
                while (r < 10) {
                    int c = 0;
                    while (c < 10) {
                        System.out.print(maze[r][c]);
                        System.out.print("  ");
                        c++;
                    }
                    System.out.println();
                    r++;
                }
            } else if (choice == 5) {
                System.out.println("Practice 11");
                for (int i = 1; i < 1001; i++) {
                    if (i % 10 == 0) {
                        System.out.println(i);
                        System.out.println("*");
                    } else {
                        System.out.println(i);
                    }
                }
            } else if (choice == 6) {
                System.out.println("Practice 12");
                for (long pow = 0; pow < 51; pow++) {
                    System.out.println((long) Math.pow(2, pow));
                }
            } else {
                System.out.println("Invalid Input");
            }
            System.out.println("Enter the loop that you want to see: ");
            System.out.println("""
                           0 = Exit
                           1 = Practice 7
                           2 = Practice 8
                           3 = Practice 9
                           4 = Practice 10
                           5 = Practice 11
                           6 = Practice 12""");
            choice = input.nextInt();
        }
    }

}
