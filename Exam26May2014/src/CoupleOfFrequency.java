import java.util.*;


public class CoupleOfFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputNumbers = scanner.nextLine();
        String[] numbers = inputNumbers.split(" ");
        Map<String, Integer> couples = new LinkedHashMap<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            String currentCouple = numbers[i] + " " + numbers[i + 1];
            if (!couples.containsKey(currentCouple)) {
                couples.put(currentCouple,1);
            } else {
                couples.put(currentCouple, couples.get(currentCouple) + 1);
            }

        }

        for (Map.Entry<String, Integer> couple : couples.entrySet()) {
            float frequency = (float)couple.getValue() / (numbers.length - 1);
            System.out.printf("%s -> %.2f%%\n", couple.getKey(), frequency * 100);
        }
    }
}
