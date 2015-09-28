import java.lang.reflect.Array;
import java.util.*;

public class SumCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<String, Integer> cardValues = new HashMap<String, Integer>() {{
            put("2", 2);
            put("3", 3);
            put("4", 4);
            put("5", 5);
            put("6", 6);
            put("7", 7);
            put("8", 8);
            put("9", 9);
            put("10", 10);
            put("J", 12);
            put("Q", 13);
            put("K", 14);
            put("A", 15);
        }};
        String[] cards = line.split("[\\sHCSD]+");
        int sum = 0;
        int prevValue = -1;
        int count = 0;
        for (int i = 0; i < cards.length; i++) {
            String currentCard = cards[i];
            int value = cardValues.get(currentCard);
            if (value == prevValue) {
                count++;
            } else {
                count = 1;
            }
            sum += value;
            if (count == 2){
                sum = sum + 2 * value;
            }
            if (count > 2) {
                sum = sum + value;
            }
            prevValue = value;

        }

        System.out.println(sum);
    }
}
