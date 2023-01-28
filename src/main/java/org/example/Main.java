package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Type number: ");
        int number = in.nextInt();
        if (number%2!=0){
            return;
        }
        int first = 1;
        int second = number-first;
        while (!(isPrime(first)&isPrime(second))){
            first++;
            second = number-first;
        }
        System.out.printf("First: %d, Second: %d", first, second);
    }
    static boolean isPrime(int num){
        for(int i = 2 ; i < num; i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}