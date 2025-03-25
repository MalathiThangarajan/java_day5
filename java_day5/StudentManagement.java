package interview_task;
import java.util.*;

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            HashMap<String, String> studentDetails = new HashMap<>();
            System.out.println("Enter the Student Name:");
            String name = scanner.nextLine();
            System.out.println("Enter the id:");
            String id = scanner.nextLine();
            System.out.println("Enter the grade:");
            String grade = scanner.nextLine();

            studentDetails.put("Name", name);
            studentDetails.put("ID", id);
            studentDetails.put("Grade", grade);
            students.add(studentDetails);
        }

        System.out.println("The Students:");
        for (HashMap<String, String> student : students) {
            System.out.println("Student Details: " + student);
        }

        scanner.close();
    }
}
