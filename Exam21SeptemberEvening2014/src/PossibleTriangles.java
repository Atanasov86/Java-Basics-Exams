import java.util.*;

public class PossibleTriangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sidesOfTriangle = scanner.nextLine();

        while (!sidesOfTriangle.equals("End")){
            String[] sidesAsString = sidesOfTriangle.split("\\s+");



            sidesOfTriangle = scanner.nextLine();
        }
    }
}
