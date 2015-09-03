import java.util.Scanner;

public class DozenEggs {
    public static void main(String[] args) {
        int finalDozens = 0;
        int finalEggs = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            String[] currentLineInput = scanner.nextLine().split(" ");
            String currentMeasure = currentLineInput[1];
            int currentNumber = Integer.parseInt(currentLineInput[0]);
            if (currentMeasure.equals("eggs")) {
                finalEggs += currentNumber;
            } else {
                finalDozens += currentNumber;
            }
        }

        while (finalEggs >= 12) {
            int dozens = finalEggs / 12;
            finalEggs%=12;
            finalDozens+= dozens;
        }

        System.out.printf("%1$d dozens + %2$d eggs",finalDozens,finalEggs);
    }
}
