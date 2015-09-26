import java.util.Scanner;

public class CountBeers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        int allBeers = 0;
        while (!line.equals("End")) {
            String[] tokens = line.split(" ");
            int count = Integer.parseInt(tokens[0]);
            String measure = tokens[1];
            if (measure.equals("stacks")){
                count = count * 20;
            }

            allBeers+=count;
            line = scanner.nextLine();
        }

        System.out.printf("%s stacks + %s beers",allBeers / 20,allBeers % 20);
    }
}
