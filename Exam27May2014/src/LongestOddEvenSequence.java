import java.util.Scanner;

public class LongestOddEvenSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String[] numbers = inputLine.split("[\\s()]+", 0);
        int length = 0;
        int maxLength = 0;
        boolean shouldBeOdd = Integer.parseInt(numbers[1]) % 2 != 0;
        for (int i = 1; i < numbers.length; i++) {
            int number = Integer.parseInt(numbers[i]);
            boolean isOdd = number % 2 != 0;
            if (shouldBeOdd == isOdd || number == 0){
                length++;
            } else {
                shouldBeOdd = isOdd;
                length = 1;
            }
            shouldBeOdd = !shouldBeOdd;
            if (length > maxLength){
                maxLength = length;
            }
        }
        System.out.println(maxLength);
    }
}
