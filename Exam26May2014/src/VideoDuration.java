import java.util.Scanner;

public class VideoDuration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalHours = 0;
        int totalMinutes = 0;
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("End")){
                break;
            }

            int currentHours = 0;
            int currentMinutes = 0;
            String[] tokens = line.split(":");
            currentHours = Integer.parseInt(tokens[0]);
            currentMinutes = Integer.parseInt(tokens[1]);
            totalHours += currentHours;
            totalMinutes += currentMinutes;
        }

        while (totalMinutes > 59){
            totalMinutes -= 60;
            totalHours += 1;
        }

        System.out.printf("%d:%02d",totalHours,totalMinutes);
    }
}
