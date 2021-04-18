package Zad4;

import java.util.List;

public class Main {

    public long solve(List<Long> input) {

        for(int i = 25; i < input.size(); i++) {

            List<Long> temp = input.subList(i - 25, i);
            boolean tempContains = false;
            for(int j = 0; j < temp.size() && !tempContains; j++) {
                for(int k = 0; k < temp.size() && !tempContains; k++) {
                    if(j != k && temp.get(j) + temp.get(k) == input.get(i))
                        tempContains = true;
                }
            }
            if(!tempContains) return input.get(i);
        }

        return -1;
    }

}
