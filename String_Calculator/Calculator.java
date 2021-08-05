package String_Calculator;

public class Calculator {
    public static int Add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        } else if (numbers.contains(",")) {
            String nums[] = numbers.split(",");
            int sum = 0;
            for (String i : nums) {
                sum = sum + Integer.parseInt(i);
            }
            return sum;
        } else {
            return Integer.parseInt(numbers);
        }
    }

}