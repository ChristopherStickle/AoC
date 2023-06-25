//--- Day 6: Tuning Trouble ---

package AoC2022.Day6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private ArrayList<Integer> buffer;

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("src/AoC2022/Day6/input.txt"));
        sc.useDelimiter("");
        ArrayList<Character> buffer = new ArrayList<>();
        int count = 0;
        while(sc.hasNext()) {
            char token = sc.next().charAt(0);
            if(token == '\n') break;
            buffer.add(token);
            if(buffer.size() > 14) {
                buffer.remove(0);
            }
            count++;
            if(buffer.size()==14 && allDifferent(buffer)){
                System.out.println(count);
                break;
            }
        }


    }

    public static boolean allDifferent(ArrayList<Character> buffer){
        for(int i = 0; i < buffer.size(); i++){
            for(int j = i+1; j < buffer.size(); j++){
                if(buffer.get(i) == buffer.get(j)) return false;
            }
        }
        return true;
    }
}
