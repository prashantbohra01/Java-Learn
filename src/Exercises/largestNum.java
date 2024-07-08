package Exercises;

import java.util.Scanner;

public class largestNum {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1. ");
        a = sc.nextInt();
        System.out.print("Enter the number 2. ");
        b = sc.nextInt();
        System.out.print("Enter the number 3. ");
        c = sc.nextInt();
        
        int max = a;

        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println(max);
    }
}
