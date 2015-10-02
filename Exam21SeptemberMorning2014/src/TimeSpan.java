import java.util.Scanner;

public class TimeSpan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String startTime = scanner.nextLine();
        String endTime = scanner.nextLine();
        String[] startTimeParts = startTime.split(":");
        String[] endTimeParts = endTime.split(":");
        int startHours = Integer.parseInt(startTimeParts[0]);
        int startMinutes = Integer.parseInt(startTimeParts[1]);
        int startSeconds = Integer.parseInt(startTimeParts[2]);

        int endHours = Integer.parseInt(endTimeParts[0]);
        int endMinutes = Integer.parseInt(endTimeParts[1]);
        int endSeconds = Integer.parseInt(endTimeParts[2]);

        int finalSeconds = startSeconds - endSeconds;
        int finalMinutes = startMinutes - endMinutes;
        int finalHours = startHours - endHours;

        if (finalSeconds < 0) {
            finalSeconds = 60 + finalSeconds;
            finalMinutes -= 1;
        } else if (finalSeconds > 60) {
            finalSeconds -= 60;
            finalMinutes += 1;
        }

        if (finalMinutes < 0) {
            finalMinutes = 60 + finalMinutes;
            finalHours -= 1;
        } else if (finalMinutes > 60){
            finalMinutes -= 60;
            finalHours +=1;
        }

        System.out.printf("%s:%02d:%02d",finalHours,finalMinutes,finalSeconds);


    }
}
