//--- Day 2: Rock Paper Scissors ---

package AoC2022.Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        /*
         Opponent:
         A for Rock, B for Paper, and C for Scissors.
         Player:
         X for Rock, Y for Paper, and Z for Scissors.
        */
        /*
        The score for a single round is the score for the shape you selected (1 for Rock, 2 for Paper, and 3 for Scissors)
        plus the score for the outcome of the round (0 if you lost, 3 if the round was a draw, and 6 if you won).

        X means you need to lose, Y means you need to end the round in a draw, and Z means you need to win.
         */

        Scanner sc = new Scanner(new File("src/Aoc2022/Day2/input.txt"));
        int score = 0;
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] split = line.split(" ");
            for(int i = 0; i < split.length; i++) {
                if(split[i].equals("A")) {
                    if(split[i+1].equals("X")) {
                        score += 3;
                        score += 0;
                    } else if(split[i+1].equals("Y")) {
                        score += 1;
                        score += 3;
                    } else if(split[i+1].equals("Z")) {
                        score += 2;
                        score += 6;
                    }
                } else if(split[i].equals("B")) {
                    if(split[i+1].equals("X")) {
                        score += 1;
                        score += 0;
                    } else if(split[i+1].equals("Y")) {
                        score += 2;
                        score += 3;
                    } else if(split[i+1].equals("Z")) {
                        score += 3;
                        score += 6;
                    }
                } else if(split[i].equals("C")) {
                    if(split[i+1].equals("X")) {
                        score += 2;
                        score += 0;
                    } else if(split[i+1].equals("Y")) {
                        score += 3;
                        score += 3;
                    } else if(split[i+1].equals("Z")) {
                        score += 1;
                        score += 6;
                    }
                }
            }
            System.out.println(score);
        }

    }
}
