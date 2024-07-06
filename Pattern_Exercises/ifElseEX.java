
import java.util.Scanner;

// WAP that displays the following menu, then acts accordingly:
// Enter your choice:
// 1. Add two numbers
// 2. Get the subtract of two numbers
// 3. Get the multiply of two numbers

// with if statement and switch statement - the program should give an error message for invalid inputs

public class ifElseEX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First number: ");
        int x = sc.nextInt();
        System.out.print("Enter Second number: ");
        int y = sc.nextInt();
        
        System.out.print("Choose your operation: 1. Addition, 2. Subtraction, 3. Multiplication, 4. Division : ");
        int choice = sc.nextInt();

        if(choice==1)
            System.out.println("The addition is: " + (x+y));
        else if (choice==2)
            System.out.println("The Subtraction is: " + (x-y));
        else if (choice==3)
            System.out.println("The Multiplication is: " + (x*y));
        else if (choice==4)
            System.out.println("The Division is: " + ((float) x/y));
        else
            System.out.println("Please choose a value Between 1 & 4");
        
    }
}
