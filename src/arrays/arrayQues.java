// Exercise : Take an array as input from the user. Search for a given no. x and print the index at which it occurs

package arrays;

import java.util.Scanner;

public class arrayQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array: " );
        int size = sc.nextInt();

        int numbers[] = new int[size];

        // input

        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.print("Search for this number index in the list: ");
        int x = sc.nextInt(); 

        // OUTPUT
        for(int i=0; i<size; i++){
            if(numbers[i]==x){
                System.out.println("The req. number is found at index: " + i);
            }
        }
    }
}
