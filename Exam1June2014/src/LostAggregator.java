import java.util.*;

public class LostAggregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfInputRows = Integer.parseInt(scanner.nextLine());
        TreeMap<String, Integer> durations = new TreeMap<>();
        TreeMap<String, TreeSet<String>> ipAddresses = new TreeMap<>();

        for (int i = 0; i < numberOfInputRows; i++) {
            String inputLine = scanner.nextLine();
            String[] tokens = inputLine.split("\\s+");
            String ipAddress = tokens[0];
            String name = tokens[1];
            int duration = Integer.parseInt(tokens[2]);
            if (!durations.containsKey(name)) {
                durations.put(name, duration);
            } else {
                int prevDuration = durations.get(name);
                durations.put(name, prevDuration + duration);
            }

            if (!ipAddresses.containsKey(name)) {
                ipAddresses.put(name, new TreeSet<>());
                ipAddresses.get(name).add(ipAddress);
            } else {
                ipAddresses.get(name).add(ipAddress);
            }
        }

        for (Map.Entry<String, Integer> duration : durations.entrySet()) {
            System.out.printf("%s: %s ", duration.getKey(), duration.getValue());
            String ipAddress = "[" + String.join(", ", ipAddresses.get(duration.getKey())) + "]";
            System.out.println(ipAddress);
        }
    }
}
