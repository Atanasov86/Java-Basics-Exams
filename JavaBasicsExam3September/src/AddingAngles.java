import java.util.ArrayList;
import java.util.Scanner;

public class AddingAngles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] numbers = new Integer[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        boolean hasSequence = false;

        for (int i = 0; i < numbers.length - 2; i++) {
            for (int j = i + 1; j < numbers.length - 1; j++) {
                for (int k = j + 1; k < numbers.length; k++) {
                    int a = numbers[i];
                    int b = numbers[j];
                    int c = numbers[k];
                    boolean isValidSequence = (a + b + c) % 360 == 0;
                    if (isValidSequence) {
                        String currentSequence = String.format("%d + %d + %d = %d degrees", a, b, c, a + b + c);
                        System.out.println(currentSequence);
                        hasSequence = true;
                    }
                }
            }
        }

        if (!hasSequence) {
            System.out.println("No");
        }

    }
}
