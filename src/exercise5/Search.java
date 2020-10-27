package exercise5;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        System.out.print("Search for number: ");
        int number = input.nextInt();

        int numberIndex = -1;
        int leftIndex= 0;
        int rightIndex= numbers.length - 1;
        int middleIndex;
        do{
          middleIndex = (leftIndex + rightIndex)/2;
           int middleElement= numbers[middleIndex];

          if(middleElement==number){
            numberIndex = middleIndex;
            break;
          }

          if (middleElement>number){
            rightIndex= middleIndex-1;
          }else{
            leftIndex=middleIndex+1;
          }

        }while(leftIndex<=rightIndex);

        System.out.println("Number index: " + numberIndex);
    }
}
