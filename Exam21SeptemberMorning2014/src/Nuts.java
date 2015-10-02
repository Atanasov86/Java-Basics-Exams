import javafx.collections.transformation.SortedList;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Nuts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfRows = Integer.parseInt(scanner.nextLine());
        TreeMap<String, LinkedHashMap<String, Integer>> data = new TreeMap<>();

        for (int i = 0; i < numberOfRows; i++) {
            String line = scanner.nextLine();
            String[] lineParts = line.split("\\s++");
            String company = lineParts[0];
            String typeOfNuts = lineParts[1];
            int amount = Integer.parseInt(lineParts[2].substring(0, lineParts[2].length() - 2));

            if (!data.containsKey(company)) {
                data.put(company, new LinkedHashMap<>());
            }

            if (!data.get(company).containsKey(typeOfNuts)) {
                data.get(company).put(typeOfNuts, 0);
            }
            int prevAmount = data.get(company).get(typeOfNuts);
            data.get(company).put(typeOfNuts, prevAmount + amount);
        }

        for (Map.Entry<String, LinkedHashMap<String, Integer>> pair : data.entrySet()) {
            StringBuilder output = new StringBuilder();
            output.append(pair.getKey() + ": ");
            for (Map.Entry<String, Integer> innerPair : pair.getValue().entrySet()) {
                output.append(innerPair.getKey() + "-" + innerPair.getValue()+"kg, ");
            }
            System.out.println(output.substring(0,output.length() - 2));
        }
    }
}
