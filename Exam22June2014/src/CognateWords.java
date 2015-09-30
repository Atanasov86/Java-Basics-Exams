import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class CognateWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String[] words = inputLine.split("[^a-zA-Z]+");
        if (inputLine.length() >= 1000){
            System.out.println("No");
        }
        HashSet<String> cognateWords = new HashSet<>();
        for (int a = 0; a < words.length; a++) {
            for (int b = 0; b < words.length; b++) {
                for (int c = 0; c < words.length; c++) {
                    if (a != b) {
                        String leftString = words[a] + words[b];
                        String rightString = words[c];
                        if (leftString.equals(rightString)) {
                            String currentCognateWord = words[a] + "|" + words[b] + "=" + words[c];
                            cognateWords.add(currentCognateWord);
                        }
                    }

                }
            }
        }

        if (cognateWords.size() != 0){
            cognateWords.forEach(System.out::println);
        } else {
            System.out.println("No");
        }
    }
}
