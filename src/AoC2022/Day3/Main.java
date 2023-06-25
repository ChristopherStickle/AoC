//--- Day 3: Rucksack Reorganization ---


        package AoC2022.Day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("src/AoC2022/Day3/input.txt"));
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int sum = 0;
        //--- Part One ---
        /*while(sc.hasNextLine()) {
            String line = sc.nextLine();
            String left = line.substring(0, line.length() / 2);
            String right = line.substring(line.length() / 2, line.length());
            char letter=0;
            //find the char that exists in both strings
            for (int i = 0; i < left.length(); i++) {
                for (int j = 0; j < right.length(); j++) {
                    if (left.charAt(i) == right.charAt(j)) {
                        letter = left.charAt(i);
                        break;
                    }
                }
            }
            sum += (alphabet.indexOf(letter) + 1);
        }
        System.out.println(sum);*/

        //--- Part Two ---
        sum = 0;
        while(sc.hasNextLine()) {
            String group1 = sc.nextLine();
            String group2 = sc.nextLine();
            String group3 = sc.nextLine();

            char letter=0;
            //find the char that exists in all groups
            for (int i = 0; i < group1.length(); i++) {
                for (int j = 0; j < group2.length(); j++) {
                    for (int k = 0; k < group3.length(); k++) {
                        if (group1.charAt(i) == group2.charAt(j) && group2.charAt(j) == group3.charAt(k)) {
                            letter = group1.charAt(i);
                            break;
                        }
                    }
                }
            }
            sum += (alphabet.indexOf(letter) + 1);
        }
        System.out.println(sum);

    }
}
