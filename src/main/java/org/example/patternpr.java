package org.example;

import java.util.Scanner;

public class patternpr {
    public static void main(String[]args){
        Scanner dc =new Scanner(System.in);
        System.out.println("enter the words");
        String words = dc.nextLine();
        int len = words.length();
        char[] wordsAll = words.toCharArray();

//        for (int i =0;i < len;i++);{
//            for(int j=1;j < words  ;j++);
        for(int i =len-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print(wordsAll[j]);
            }
            System.out.println(" ");
        }

        // *****
        // ****

    }
}
