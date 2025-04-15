package org.example;

import java.util.Scanner;

public class validformairage {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int a= sc.nextInt();
        if (a>=21){
            System.out.println("he is valid person to get maired");
        }
        else{
            System.out.println("he is not valid for wedding");
        }
    }

}
