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
        while (second != 0){
            if(isPrime(first)&isPrime(second)){
                System.out.printf("%d + %d = %d\n", first, second, number);
            }
            first++;
            second = number - first;
        }
    }
    static boolean isPrime(int num){
        for(int i = 2 ; i < num; i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}