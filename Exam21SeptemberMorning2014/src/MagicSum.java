import java.util.ArrayList;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int divideNumber = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> numbers = new ArrayList<>();
        int maxMagicSum = Integer.MIN_VALUE;
        String magicSum = "";
        String numberAsString = scanner.nextLine();
        while (!numberAsString.equals("End")){
            numbers.add(Integer.parseInt(numberAsString));
            numberAsString = scanner.nextLine();
        }

        boolean isExistMagicSum = false;
        for (int num = 0; num < numbers.size() - 2; num++) {
            for (int num1 = num + 1; num1 < numbers.size() - 1; num1++) {
                for (int num2 = num1 + 1; num2 < numbers.size(); num2++) {
                    int currentMagicSum = numbers.get(num) + numbers.get(num1) + numbers.get(num2);
                    if (currentMagicSum % divideNumber == 0){
                        if (currentMagicSum > maxMagicSum) {
                            maxMagicSum = currentMagicSum;
                            magicSum = "(" + numbers.get(num) + " + " + numbers.get(num1) +
                                    " + " + numbers.get(num2) + ")" + " % " + divideNumber + " = 0";
                            isExistMagicSum = true;

                        }
                    }
                }
            }
        }

        if (!isExistMagicSum){
            System.out.println("No");
        } else {
            System.out.println(magicSum);
        }
    }
}
