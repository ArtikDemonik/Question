package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Type firs number: ");
        int num = in.nextInt();
        while (num!=1){
            System.out.printf("%d, ", num);
            if (num%2==0)
                num/=2;
            else
                num = num*3+1;
        }
        System.out.println(1);
    }
}