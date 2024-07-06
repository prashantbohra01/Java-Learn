
import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        
        // 1. Initialize what we know

        int assignment_total = 40;
        int exam_total = 200;
        int assignment_grade;
        int exam_grade;

        // 2. Get Input

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your total assignment grade: ");
        assignment_grade = sc.nextInt();

        System.out.print("Please enter your final exam grade: ");
        exam_grade = sc.nextInt();

        // 3. Do some processing
        
        int student_grade = assignment_grade + exam_grade;
        int total = assignment_total + exam_total;

        float percentage = (float)student_grade/total * 100;

        // 4. Print Output
        
        System.out.println("Your total grade is: "+student_grade);
        System.out.println("Your percentage is: "+percentage);
    }
}
