import java.util.ArrayList;
import java.util.Scanner;

public class MirrorNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfNumbers = Integer.parseInt(scanner.nextLine());
        ArrayList<String> numbers = new ArrayList<>();
        boolean isExistMirrorNumber = false;

        for (int i = 0; i < countOfNumbers; i++) {
            numbers.add(scanner.next());
        }


        for (int num = 0; num < countOfNumbers - 1; num++) {
            for (int num1 = num + 1; num1 < countOfNumbers; num1++) {
                String firstNumber = numbers.get(num);
                String reversedFirstNumber = getReverseNumber(firstNumber);
                String secondNumber = numbers.get(num1);
                if (reversedFirstNumber.equals(secondNumber)){
                    isExistMirrorNumber = true;
                    System.out.printf("%s<!>%s",firstNumber,secondNumber);
                    System.out.println();
                }
            }
        }

        if (!isExistMirrorNumber){
            System.out.println("No");
        }
    }

    private static String getReverseNumber (String number){
        StringBuilder sb = new StringBuilder(number);
        sb.reverse();
        return sb.toString();
    }
}
