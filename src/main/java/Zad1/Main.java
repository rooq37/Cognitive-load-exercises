package Zad1;

import java.util.List;

public class Main {

    public int solve(List<Integer> input) {

        for(int i = 0; i < input.size(); i++) {
            for(int j = 0; j < input.size(); j++) {
                if(i != j) {
                    if(input.get(i) + input.get(j) == 2020) {
                        return input.get(i) * input.get(j);
                    }
                }
            }
        }

        return -1;
    }

}
