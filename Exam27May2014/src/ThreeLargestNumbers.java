
import java.math.BigDecimal;
import java.util.*;

public class ThreeLargestNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfRow = scanner.nextInt();
        scanner.nextLine();
        ArrayList<BigDecimal> numbers = new ArrayList<>();

        for (int i = 0; i < numberOfRow; i++) {
            String numbersAsString = scanner.nextLine();
            numbers.add(new BigDecimal(numbersAsString));
        }

        Collections.sort(numbers);
        int count = 3;
        for (int i = numbers.size() - 1; i >= 0 && count > 0; i--,count--) {
            System.out.println(numbers.get(i).toPlainString());
        }
    }


}
