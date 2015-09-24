import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Largest3Rectangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lineOfRectangles = scanner.nextLine();
        String[] sidesOfRectangles = lineOfRectangles.split("(\\s+\\[*)|(\\s*\\])|(\\[)|(\\])|(x)");
        List<Integer> rectangles = new ArrayList<>();
        for (String sidesOfRectangle : sidesOfRectangles) {
            if (!sidesOfRectangle.equals("")) {
                rectangles.add(Integer.parseInt(sidesOfRectangle));
            }
        }
        int maxRectanglesArea = 0;

        for (int i = 0; i < (rectangles.size() - 4); i +=2) {
            int currentRectanglesArea = 0;
            int firstRectX = rectangles.get(i);
            int firstRectY = rectangles.get(i + 1);
            int secondRectX = rectangles.get(i + 2);
            int secondRectY = rectangles.get(i + 3);
            int thirdRectX = rectangles.get(i + 4);
            int thirdRectY = rectangles.get(i + 5);
            currentRectanglesArea = calculateRectangleArea(firstRectX,firstRectY) +
                    calculateRectangleArea(secondRectX, secondRectY) +
                    calculateRectangleArea(thirdRectX,thirdRectY);
            if (currentRectanglesArea > maxRectanglesArea){
                maxRectanglesArea = currentRectanglesArea;
            }
        }

        System.out.println(maxRectanglesArea);

    }

    public static int calculateRectangleArea(int sideA, int sideB) {
        return sideA * sideB;
    }
}
