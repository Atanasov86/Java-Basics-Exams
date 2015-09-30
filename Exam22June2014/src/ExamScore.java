import java.util.*;

public class ExamScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<Integer, TreeSet<String>> namesByExamScore = new TreeMap<>();
        TreeMap<Integer, ArrayList<Double>> gradesByExamScore = new TreeMap<>();

        scanner.nextLine();
        scanner.nextLine();
        scanner.nextLine();
        while (true) {
            String inputLine = scanner.nextLine();
            if (inputLine.startsWith("-")) {
                break;
            }
            String[] tokens = inputLine.trim().split("[\\s|]+");
            String nameOfStudent = tokens[1] + " " + tokens[2];
            int examScore = Integer.parseInt(tokens[3]);
            double studentGrade = Double.parseDouble(tokens[4]);
            //checking whether exam score is contains in namesByExamScore
            if (!namesByExamScore.containsKey(examScore)){
                namesByExamScore.put(examScore,new TreeSet<>());
                namesByExamScore.get(examScore).add(nameOfStudent);
            } else {
                namesByExamScore.get(examScore).add(nameOfStudent);
            }

            //checking whether exam score is contains in gradesByExamScore
            if (!gradesByExamScore.containsKey(examScore)){
                gradesByExamScore.put(examScore,new ArrayList<>());
                gradesByExamScore.get(examScore).add(studentGrade);
            } else {
                gradesByExamScore.get(examScore).add(studentGrade);
            }
        }

        for (Map.Entry<Integer, TreeSet<String>> pointsByName : namesByExamScore.entrySet()) {
            String nameOfStudents = String.join(", ",pointsByName.getValue());
            ArrayList<Double> grades = gradesByExamScore.get(pointsByName.getKey());
            double currentStudentAvgGrade = getAverageGrades(grades);
            System.out.printf("%s -> [%s]; avg=%.2f", pointsByName.getKey(),nameOfStudents,currentStudentAvgGrade);
            System.out.println();
        }
    }

    private static double getAverageGrades(List<Double> grades){
        double averageGrade = 0;
        for (Double grade : grades) {
            averageGrade += grade / grades.size();
        }

        //averageGrade /= grades.size();
        return averageGrade;
    }
}
