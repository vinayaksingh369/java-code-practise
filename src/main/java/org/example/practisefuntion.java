package org.example;

import java.util.Scanner;

public class practisefuntion {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first num:");
        int num1 = in.nextInt();
        System.out.println("enter the second num: ");
        int num2 = in.nextInt();
        int sum = num1+num2;
        System.out.println("the value of sum:"+sum);
    }
}
