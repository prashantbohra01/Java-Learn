
import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a value between 1 & 5: ");
        int grade = sc.nextInt();

        switch(grade){
            case 1:
                System.out.println("The value is 1");
                break;
            case 2:
                System.out.println("The value is 2");
                break;
            case 3:
                System.out.println("The value is 3");
                break;
            case 4:
                System.out.println("The value is 4");
                break;
            case 5:
                System.out.println("The value is 5");
                break;
            default:
                System.err.println("The value is not between 1 & 5");
        }
    }
}
