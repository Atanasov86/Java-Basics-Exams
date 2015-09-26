
import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfRow = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, TreeMap<String, Integer>> allProducts = new LinkedHashMap<>();
        for (int i = 0; i < numberOfRow; i++) {
            String inputLine = scanner.nextLine();
            String[] tokens = inputLine.split("\\s+");
            String costumerName = tokens[0];
            int amount = Integer.parseInt(tokens[1]);
            String currentProduct = tokens[2];
            if (!allProducts.containsKey(currentProduct)){
                allProducts.put(currentProduct, new TreeMap<>());
            }

            if (allProducts.get(currentProduct).containsKey(costumerName)){
                int currentCountOfProduct = allProducts.get(currentProduct).get(costumerName);
                System.out.println();
                allProducts.get(currentProduct).put(costumerName, currentCountOfProduct + amount);
            } else {
                allProducts.get(currentProduct).put(costumerName,amount);
            }

        }

        for (Map.Entry<String, TreeMap<String, Integer>> product : allProducts.entrySet()) {
            System.out.printf("%s: ", product.getKey());
            boolean first = true;
            for (Map.Entry<String, Integer> costumer : product.getValue().entrySet()) {
                if (!first){
                    System.out.print(", ");
                }
                first = false;
                System.out.printf("%s %s", costumer.getKey(), costumer.getValue());
            }
            System.out.println();
        }

    }
}
