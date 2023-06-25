//--- Day 4: Camp Cleanup ---
package AoC2022.Day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/AoC2022/Day4/input.txt"));
        int count = 0;
        //--Part 1--//
        /*while(sc.hasNextLine()) {
            String line = sc.nextLine();
            String first_pair = line.substring(0, line.indexOf(','));
            String second_pair = line.substring(line.indexOf(',') + 1);

            int first_car = Integer.parseInt(first_pair.substring(0, first_pair.indexOf('-')));
            int first_cdr = Integer.parseInt(first_pair.substring(first_pair.indexOf('-') + 1));
            int second_car = Integer.parseInt(second_pair.substring(0, second_pair.indexOf('-')));
            int second_cdr = Integer.parseInt(second_pair.substring(second_pair.indexOf('-') + 1));

            if (first_car <= second_car && first_cdr >= second_cdr) {
                count += 1;
            } else if (second_car <= first_car && second_cdr >= first_cdr) {
                count += 1;
            }
        }
        System.out.println(count);*/

        //--Part 2--//
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            String first_pair = line.substring(0, line.indexOf(','));
            String second_pair = line.substring(line.indexOf(',') + 1);

            int first_car = Integer.parseInt(first_pair.substring(0, first_pair.indexOf('-')));
            int first_cdr = Integer.parseInt(first_pair.substring(first_pair.indexOf('-') + 1));
            int second_car = Integer.parseInt(second_pair.substring(0, second_pair.indexOf('-')));
            int second_cdr = Integer.parseInt(second_pair.substring(second_pair.indexOf('-') + 1));

            if (second_car >= first_car && second_car <= first_cdr) {
                count += 1;
            } else if (first_car >= second_car && first_car <= second_cdr) {
                count += 1;
            }
        }
        System.out.println(count);

    }
}
