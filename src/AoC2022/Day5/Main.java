package AoC2022.Day5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/AoC2022/Day5/input.txt"));
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Stack<Character>> containers = new ArrayList<>();
        for(int i = 0; i < 9; i++) {
            containers.add(new Stack<>());
        }
        /*  [P]     [C]         [M]
            [D]     [P] [B]     [V] [S]
            [Q] [V] [R] [V]     [G] [B]
            [R] [W] [G] [J]     [T] [M]     [V]
            [V] [Q] [Q] [F] [C] [N] [V]     [W]
            [B] [Z] [Z] [H] [L] [P] [L] [J] [N]
            [H] [D] [L] [D] [W] [R] [R] [P] [C]
            [F] [L] [H] [R] [Z] [J] [J] [D] [D]
             1   2   3   4   5   6   7   8   9 */
        // for each char in string push onto stack
        //Stack 1:
        String line = "FHBVRQDP";
        for(int i = 0; i < line.length(); i++) {
            containers.get(0).push(line.charAt(i));
        }
        //Stack 2:
        line = "LDZQWV";
        for(int i = 0; i < line.length(); i++) {
            containers.get(1).push(line.charAt(i));
        }
        //Stack 3:
        line = "HLZQGRPC";
        for(int i = 0; i < line.length(); i++) {
            containers.get(2).push(line.charAt(i));
        }
        //Stack 4:
        line = "RDHFJVB";
        for(int i = 0; i < line.length(); i++) {
            containers.get(3).push(line.charAt(i));
        }
        //Stack 5:
        line = "ZWLC";
        for(int i = 0; i < line.length(); i++) {
            containers.get(4).push(line.charAt(i));
        }
        //Stack 6:
        line = "JRPNTGVM";
        for(int i = 0; i < line.length(); i++) {
            containers.get(5).push(line.charAt(i));
        }
        //Stack 7:
        line = "JRLVMBS";
        for(int i = 0; i < line.length(); i++) {
            containers.get(6).push(line.charAt(i));
        }
        //Stack 8:
        line = "DPJ";
        for(int i = 0; i < line.length(); i++) {
            containers.get(7).push(line.charAt(i));
        }
        //Stack 9:
        line = "DCNWV";
        for(int i = 0; i < line.length(); i++) {
            containers.get(8).push(line.charAt(i));
        }




        while (sc.hasNextLine()){
            String command = sc.nextLine();
            // make an array delimited by spaces
            String[] commands = command.split(" ");
            int numtoMove = Integer.parseInt(commands[1]);
            int from = (Integer.parseInt(commands[3]))-1;
            int to = (Integer.parseInt(commands[5]))-1;
            System.out.println("Moving " + numtoMove + " from " + (from+1) + " to " + (to+1));
            char[] temp = new char[numtoMove];
            for(int i = 0; i < numtoMove; i++) {
                temp[i] = containers.get(from).pop();
            }
            for (int i = temp.length-1; i >= 0; i--) {
                containers.get(to).push(temp[i]);
            }

        }
        System.out.println(containers.get(0).peek()+""+containers.get(1).peek()+""+containers.get(2).peek()
        +""+containers.get(3).peek()+""+containers.get(4).peek()+""+containers.get(5).peek()
                +""+containers.get(6).peek()+""+containers.get(7).peek()+""+containers.get(8).peek());

    }
}
