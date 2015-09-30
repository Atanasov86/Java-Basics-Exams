import java.util.Scanner;

public class Durts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double centerFigureX = scanner.nextDouble();
        double centerFigureY = scanner.nextDouble();
        double radius = scanner.nextDouble();
        scanner.nextLine();
        scanner.nextLine();
        while (scanner.hasNextLine()) {
            String pointsAsString = scanner.nextLine();
            String[] points = pointsAsString.split("\\s+");
            for (int i = 0; i < points.length - 1; i += 2) {
                double currentPointX = Double.parseDouble(points[i]);
                double currentPointY = Double.parseDouble(points[i + 1]);
                boolean isInFigure = checkPointIsInRectangle(currentPointX, currentPointY, centerFigureX, centerFigureY, radius);
                if (isInFigure) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
    }

    private static boolean checkPointIsInRectangle(double pointX, double pointY, double centerX, double centerY, double radius) {
        //Checking whether point is in horizontal rectangle
        boolean isInHorizontalRect = ((pointX >= centerX - radius) && (pointX <= centerX + radius)) &&
                ((pointY >= centerY - radius / 2) && (pointY <= centerY + radius / 2));
        //Checking whether point is in vertical rectangle
        boolean isInVerticalRect = ((pointY >= centerY - radius) && (pointY <= centerY + radius)) &&
                ((pointX >= centerX - radius / 2) && (pointX <= centerX + radius / 2));
        // if one of these bools is true, therefore point is in figure
        return isInHorizontalRect || isInVerticalRect;

    }
}
