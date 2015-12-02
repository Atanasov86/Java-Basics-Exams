import java.util.Scanner;

public class SoftUniPalatkaConf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int numberOfLines = Integer.parseInt(scanner.nextLine());
        int currentBeds = 0;
        int currentFood = 0;

        for (int i = 0; i < numberOfLines; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            int currentNumberOfRooms = Integer.parseInt(tokens[1]);
            int currentNumberOfFood = Integer.parseInt(tokens[1]);
            if (tokens[0].equals("tents")) {
                if (tokens[2].equals("normal")) {
                    currentBeds += currentNumberOfRooms * 2;
                } else {
                    currentBeds += currentNumberOfRooms * 3;
                }
            } else if (tokens[0].equals("rooms")) {
                if (tokens[2].equals("double")) {
                    currentBeds += currentNumberOfRooms * 2;
                } else if (tokens[2].equals("single")) {
                    currentBeds += currentNumberOfRooms;
                } else {
                    currentBeds += currentNumberOfRooms * 3;
                }
            } else {
                if (tokens[2].equals("musaka")) {
                    currentFood += currentNumberOfFood * 2;
                }
            }
        }

        if (currentBeds >= numberOfPeople) {
            System.out.printf("Everyone is happy and sleeping well. Beds left: %d\n", currentBeds - numberOfPeople);
        } else {
            System.out.printf("Some people are freezing cold. Beds needed: %d\n", numberOfPeople - currentBeds);
        }

        if (currentFood >= numberOfPeople) {
            System.out.printf("Nobody left hungry. Meals left: %d", currentFood - numberOfPeople);
        } else {
            System.out.printf("People are starving. Meals needed: %d", numberOfPeople - currentFood);
        }
    }
}
