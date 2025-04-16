package org.example;

import java.util.Scanner;

public class practisewhil {
    public static void main(String[]args){
//        int i = 0;
//        while (i <5){
//            System.out.println(i);
//            i++;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        int i= sc.nextInt();
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);
    }
}
