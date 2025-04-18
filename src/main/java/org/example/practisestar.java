package org.example;

import java.util.Scanner;

public class practisestar {
    public static void main(String[]args){
//        Scanner cs = new Scanner(System.in);
//        System.out.println("*");
//        String words = cs.nextLine();
        for(int i=5;i>0;i--){
            for(int j =0;j<i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
