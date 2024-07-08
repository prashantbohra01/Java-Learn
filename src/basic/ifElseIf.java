package basic;

import java.util.Scanner;

public class ifElseIf {
    public static void main(String[] args) {
        int salary;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your salary: ");
        salary = sc.nextInt();

        if(salary>0 && salary<4000)
            System.out.println("Your salary is Tax free");
        else if(salary >=4000 && salary<6000)  
            System.out.println("Your salary get a Tax of 10%");
        else if(salary > 6000)
            System.out.println("Your salary get a Tax of 20%");
        else 
            System.out.println("This is an invalid value for salary");
        sc.close();
    }
}
 // && is used when both the condition are true
 // || is true if one of the condition is true
 // ! Reverse the condition from true to false or false to true