import java.util.Scanner;

public class StuckNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfNumbers = Integer.parseInt(scanner.nextLine());
        String[] numbers = new String[countOfNumbers];
        for (int i = 0; i < countOfNumbers; i++) {
            numbers[i] = scanner.next();
        }

        boolean isStuckNumberExist = false;
        for (int a = 0; a < numbers.length; a++) {
            for (int b = 0; b < numbers.length; b++) {
                for (int c = 0; c < numbers.length; c++) {
                    for (int d = 0; d < numbers.length; d++) {
                        boolean isNotEqualNumbers =
                                !numbers[a].equals(numbers[b]) &&
                                        !numbers[a].equals(numbers[c]) &&
                                        !numbers[a].equals(numbers[d]) &&
                                        !numbers[b].equals(numbers[c]) &&
                                        !numbers[b].equals(numbers[d]) &&
                                        !numbers[c].equals(numbers[d]);
                        if (isNotEqualNumbers){
                            String leftStuckNumber = "" + numbers[a] + numbers[b];
                            String rightStuckNumber = "" + numbers[c] + numbers[d];
                            if (leftStuckNumber.equals(rightStuckNumber)){
                                isStuckNumberExist = true;
                                String result = String.format("%s|%s==%s|%s",numbers[a],numbers[b],numbers[c],numbers[d]);
                                System.out.println(result);
                            }

                        }

                    }
                }
            }
        }

        if (!isStuckNumberExist){
            System.out.println("No");
        }
    }
}
