import java.util.HashSet;
import java.util.Scanner;

public class PythagoreanNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numbersCount = scan.nextInt();
        Integer[] numbers = new Integer[numbersCount];
        for (int i = 0; i < numbersCount; i++) {
            numbers[i] = scan.nextInt();
        }

        int count = 0;
        for (int a = 0; a < numbers.length; a++) {
            for (int b = 0; b < numbers.length; b++) {
                for (int c = 0; c < numbers.length; c++) {
                    int firstNum = numbers[a];
                    int secondNum = numbers[b];
                    int thirdNum = numbers[c];
                    if (firstNum <= secondNum && (firstNum*firstNum + secondNum*secondNum == thirdNum*thirdNum)){
                        String result = String.format("%1$d*%1$d + %2$d*%2$d = %3$d*%3$d",firstNum,secondNum,thirdNum);
                        System.out.println(result);
                        count++;
                    }
                }
            }
        }

        if (count == 0){
            System.out.println("No");
        }
    }
}
