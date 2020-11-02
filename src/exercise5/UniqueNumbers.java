package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];
      
        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        int[] uniqueNumbers = new int[numbers.length];
        int uniqueI = 0;
        for (int index = 0; index < numbers.length; index++) {
          int counter = 0;

            for ( int a = 0; a < index; a++) {
                if (uniqueNumbers[a] == numbers[index]) {
                  counter = 1;
                  break;
                }
            }
            if (counter == 0){

                uniqueNumbers[uniqueI] = numbers[index];

                uniqueI++;
            }
        }
        

        String uniqueNumbersAsString = Arrays.toString(uniqueNumbers);
        System.out.println("Unique numbers: " + uniqueNumbersAsString);
    }
}
