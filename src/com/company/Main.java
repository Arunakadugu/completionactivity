package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1, num2, i = 1;
        int sum ;
        int average;
        int product;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First Number? :");
        num1 = keyboard.nextInt();

        System.out.print("Last Number?  :");
        num2 = keyboard.nextInt();

            sum = num1 + num2;
            System.out.println(" sum is:" +sum);
            average = sum / 2;
            System.out.println("average is:" +average);
            product = num1 * num2;
            System.out.println("product is:" +product);
           if(sum > 200)
               System.out.println("*" +sum);
           else if(sum < 1000)
               System.out.println("~" +sum);
           else
               System.out.println(" ");
    }
}
