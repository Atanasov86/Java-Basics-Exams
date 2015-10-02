import java.util.Arrays;
import java.util.Scanner;

public class WeirdStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] words = line.split("([\\s()|\\\\]+)");
        String lineWithoutJunkCharacter = Arrays.toString(words);
        lineWithoutJunkCharacter = lineWithoutJunkCharacter.replace(",", "");
        lineWithoutJunkCharacter = lineWithoutJunkCharacter.replace(" ", "");
        String[] finalWords = lineWithoutJunkCharacter.split("[^a-zA-Z]+");
        int maxSum = Integer.MIN_VALUE;
        String result = "";
        for (int i = 1; i < finalWords.length - 1; i++) {
            String firstCurrentWord = finalWords[i];
            String secondCurrentWord = finalWords[i + 1];
            int currentFirstWordWeight = getWeightOfWord(firstCurrentWord);
            int currentSecondWordWeight = getWeightOfWord(secondCurrentWord);
            int currentSum = currentFirstWordWeight + currentSecondWordWeight;
            if (currentSum > maxSum){
                maxSum = currentSum;
                result = firstCurrentWord + "\n" + secondCurrentWord;
            }
        }

        System.out.println(result);
    }

    private static int getWeightOfWord(String word){
        int weight = 0;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            currentChar = Character.toLowerCase(currentChar);
            int currentCharWeight = currentChar - '`';
            weight += currentCharWeight;
        }

        return weight;
    }
}
