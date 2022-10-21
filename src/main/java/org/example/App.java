package org.example;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = scanner.nextInt();
        int result = indexOf(input);
        System.out.println("result = " + result);
    }


    //a method with name ‘indexOf’
    //return the index of an element in the array ?
    public static int indexOf(int inputNumber) {
        int[] numbers = new int[]{44, 4, 56, 33, 22, 14, 2};
        int size = numbers.length;

        for (int i = 0; i < size; i++) {
            //return the index of an element in the array
            if (numbers[i] == inputNumber) {
                return i;
            }
        }
        //If the element doesn’t exist your method should return -1 as value.
        return -1;
    }

}
