package org.example;

public class practisefor {
    public static void main (String[]args){
        for(int i=0;i<5; i++){
            System.out.println(i);
        }
        System.out.println("__________");
        for (int d=0; d<=12;d=d+2){
            System.out.println(d);
        }
        System.out.println("nested loop");
        for(int a=1;a <= 2;a++){
            System.out.println("outeer:" + a);
            for (int j =1;j<=3;j++){
                System.out.println("Inner: " + j);
            }
        }
    }
}
