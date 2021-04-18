package Zad2;

import java.util.List;

public class Main {

    public int solve(List<String> input) {
        int correctRecords = 0;

        for(String record : input) {
            int min = getMinOccurrencesFromRule(record);
            int max = getMaxOccurrencesFromRule(record);
            char letter = getLetterFromRule(record);
            String text = getText(record);
            int occurrences = countOccurrences(text, letter);
            if(occurrences >= min && occurrences <= max)
                correctRecords++;
        }
        return correctRecords;
    }

    private int getMinOccurrencesFromRule(String record) {
        return Integer.parseInt(getNumberOfOccurrences(record).split("-")[0]);
    }

    private int getMaxOccurrencesFromRule(String record) {
        return Integer.parseInt(getNumberOfOccurrences(record).split("-")[1]);
    }

    private char getLetterFromRule(String record) {
        return getRule(record).split(" ")[1].charAt(0);
    }

    private int countOccurrences(String text, char letter) {
        int occurrences = 0;
        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == letter)
                occurrences++;
        }
        return occurrences;
    }

    private String getNumberOfOccurrences(String record) {
        return getRule(record).split(" ")[0];
    }

    private String getText(String record) {
        return record.split(":")[1];
    }

    private String getRule(String record) {
        return record.split(":")[0];
    }

}
