package String_Calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    public static int Add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        } else {
            String nums[] = tokenize(numbers);
            int sum = 0;
            for (String i : nums) {
                sum = sum + Integer.parseInt(i);
            }
            return sum;
        }
    }

    private static String[] tokenize(String numbers) {
        if (numbers.startsWith("//")) {
            return splitWithCustomDelimiters(numbers);
        } else {
            return splitWithCommaAndNewLineDelimiter(numbers);
        }

    }

    private static String[] splitWithCommaAndNewLineDelimiter(String numbers) {
        String[] tokens = numbers.split(",|\n");
        return tokens;
    }

    private static String[] splitWithCustomDelimiters(String numbers) {
        Matcher comp = Pattern.compile("//(.)\n(.*)").matcher(numbers);
        comp.matches();
        String customDelimiter = comp.group(1);
        System.out.println(customDelimiter);

        String num_list = comp.group(2);
        System.out.println(num_list);
        return num_list.split(customDelimiter);
    }

}