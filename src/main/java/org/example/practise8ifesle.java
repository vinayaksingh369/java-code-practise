package org.example;

import java.util.Scanner;

public class practise8ifesle {
    public static void main (String []args){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the number: ");
//        int n=sc.nextInt();
//        if (n % 2 ==0){
//            System.out.println("number is even");
//        }
//        else{
//            System.out.println("number os odd");
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b){
            System.out.println("Both Number is Equal:: n1="+a+" And n2="+b);
        } else if (a > b) {
            System.out.println("a is greater" + a);
        }
        else {
            System.out.println("bis greater"+ b);
        }

    }
}
