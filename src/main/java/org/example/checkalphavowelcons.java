package org.example;

import java.util.Scanner;

public class checkalphavowelcons {
    public static void main (String []args){
//        char ch ='i';
//        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'||ch == 'u')
//            System.out.println(ch + "is vowel");
//        else
//            System.out.println(ch + "is consonent");

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        if (a>=0){
            System.out.println("ther number n is postive:");
        }
        else{
            System.out.println("the number is neagtive");
        }
    }
}
