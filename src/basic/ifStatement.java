package basic;

import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("Please enter your age: ");
        age = sc.nextInt();

        if(age>13){
            System.out.println("You are eligible to register to the website");
            System.out.println("You can register also using the mobile App");
        }
        else
            System.out.println("Sorry, you are too young to register");
    }
}
