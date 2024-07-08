// Take an array of names as input from the user and print them on the screen.

package arrays;

import java.util.Scanner;

public class arrayQues2 {
    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array: ");
        int size = sc.nextInt();

        String names[] = new String[size];

        for( int i=0; i<size; i++){
            names[i]= sc.next();
        }
        
        for(int i=0; i<size; i++){
            System.out.println("name " + (i+1) + " is : " + names[i]);
        }

        System.out.print("Enter a name to get the index value of it: ");
        String x = sc.next();

        for(int i=0; i<size; i++){
            if(names[i].equals(x)){
                System.out.println("Index of the req name is: "+ i);
            }
        }
    }
}
