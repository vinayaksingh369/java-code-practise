package org.example;

import java.util.Scanner;

public class malefemaleweddingage {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age of M F");
        int age = sc.nextInt();
        System.out.println("enter the gender M F");
        String gen = sc.toString();
        if (gen == "male")
        {
            if(age>=21){
                System.out.println("Male is eligible to mairage:" +age);
            }
            else {
                System.out.println("male is not eligible for mairage: " +age);
            }
        }
        else if (gen =="female") {
            if (age >= 21) {
                System.out.println("female is eligble for mairage:" + age);
            } else {
                System.out.println("feamale is not eligible for mairage:" + age);
            }
        }
        else{
            System.out.println("not eligible for mairage beacuse gen is NNN:");
        }


    }

}
