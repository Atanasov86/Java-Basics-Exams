import java.util.ArrayList;
import java.util.Scanner;

public class Biggest3PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList primeNumbers = new ArrayList();
        String input = scanner.nextLine();
        String regex = "(\\s+|\\(|\\))";
        String[] numbersAsStrings = input.split(regex, -1);
        for (int i = 0; i < numbersAsStrings.length; i++) {
            String currentChar = numbersAsStrings[i];
            if (currentChar.equals("")) {
                continue;
            }
            int currentNum = Integer.parseInt(numbersAsStrings[i]);

            boolean currentNumIsPrime = checkWhetherNumberIsPrime(currentNum);
            if (currentNumIsPrime) {
                if (!primeNumbers.contains(currentNum)) {
                    primeNumbers.add(currentNum);
                }
            }
        }
        if (primeNumbers.size() < 3) {
            System.out.println("No");
        } else {
            int maxSum = sumOfTheBiggest3PrimeNumbers(primeNumbers);
            System.out.println(maxSum);
        }
    }

    public static int sumOfTheBiggest3PrimeNumbers(ArrayList<Integer> primeNumbers) {
        int maxSum = 0;
        for (int i = 0; i < primeNumbers.size() - 2; i++) {
            for (int j = i + 1; j < primeNumbers.size() - 1; j++) {
                for (int k = j + 1; k < primeNumbers.size(); k++) {
                    int currentSum = primeNumbers.get(i) + primeNumbers.get(j) + primeNumbers.get(k);
                    if (currentSum > maxSum) {
                        maxSum = currentSum;
                    }

                }

            }

        }

        return maxSum;
    }

    public static boolean checkWhetherNumberIsPrime(int number) {
        if (number <= 1) {
            return false;
        }

        int numberSquare = (int) Math.sqrt(number);
        for (int i = 2; i <= numberSquare; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
