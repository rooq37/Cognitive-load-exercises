package Zad3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public int solve(List<String> input) {

        List<Integer> numbers = new ArrayList<>();
        for(String row : input) {
            String newRow = row
                    .replaceAll("B", "1")
                    .replaceAll("F", "0")
                    .replaceAll("R", "1")
                    .replaceAll("L", "0");

            int rowNum = Integer.parseInt(newRow.substring(0, 7),2);
            int colNum = Integer.parseInt(newRow.substring(7, 10),2);

            numbers.add((rowNum * 8 + colNum));
        }
        return Collections.max(numbers);
    }

}
