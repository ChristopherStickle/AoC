//--- Day 1: Calorie Counting ---


package AoC2022.Day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("src/AoC2022/Day1/input.txt"));
        //read input.txt into and arraylist of arraylists delineated by newlines
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        ArrayList<Integer> elf = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if(!line.equals("")) {
                elf.add(Integer.parseInt(line));
            } else {
                input.add(elf);
                elf = new ArrayList<>();
            }
        }
        ArrayList<Integer> elfSums = new ArrayList<>();
        for (ArrayList<Integer> elfList : input) {
            int sum = 0;
            for (Integer integer : elfList) {
                sum += integer;
            }
            elfSums.add(sum);
        }
        //find the max sum
        int first = 0;
        int second = 0;
        int third = 0;
        //find the 3 highest sums in the arraylist
        for(int i = 0; i < elfSums.size(); i++) {
            if(elfSums.get(i) > elfSums.get(first)) {
                third = second;
                second = first;
                first = i;
            } else if(elfSums.get(i) > elfSums.get(second)) {
                third = second;
                second = i;
            } else if(elfSums.get(i) > elfSums.get(third)) {
                third = i;
            }
        }
        System.out.println("Elf #" + first + " is carrying the most calories with " + elfSums.get(first) + " calories.");
        System.out.println("Elf #" + second + " is carrying the second most calories with " + elfSums.get(second) + " calories.");
        System.out.println("Elf #" + third + " is carrying the third most calories with " + elfSums.get(third) + " calories.");
        System.out.println("The sum of the three elves with the most calories is " + (elfSums.get(first) + elfSums.get(second) + elfSums.get(third)) + ".");

    }
}
