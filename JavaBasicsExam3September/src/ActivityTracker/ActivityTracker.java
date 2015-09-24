package ActivityTracker;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class ActivityTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberAsString = scanner.nextLine();
        int numberOfRows = Integer.parseInt(numberAsString);
        TreeMap<Integer, ArrayList<User>> dataUser = new TreeMap<>();

        for (int i = 0; i < numberOfRows; i++) {
            String line = scanner.nextLine();
            String[] tokens = line.split("(/|\\s+)");
            int month = Integer.parseInt(tokens[1]);
            String username = tokens[3];
            int userDistance = Integer.parseInt(tokens[4]);
            User currentUser = new User(username, userDistance);
            if (!dataUser.containsKey(month)) {
                dataUser.put(month, new ArrayList<>());
                dataUser.get(month).add(currentUser);

            } else {
                ArrayList<User> users = dataUser.get(month);
                if (users.contains(currentUser)) {
                    int newDistance = currentUser.getDistance() + userDistance;
                    currentUser.setDistance(newDistance);
                    users.add(currentUser);
                } else {
                    users.add(currentUser);
                }
            }
        }

        System.out.println();
    }
}
