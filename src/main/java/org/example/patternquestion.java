package org.example;

public class patternquestion {
    public static void main (String[]args){
        for(int a = 0; a < 17; a++) {
            for(int b = 0; b <=a; b++) {
                System.out.print("c");
            }
            System.out.println("");
        }

        for(int a = 0; a <= 17; a++) {
            for(int b = 0; b <=17-a; b++) {
                System.out.print("c");
            }
            System.out.println("");
        }



    }
}
