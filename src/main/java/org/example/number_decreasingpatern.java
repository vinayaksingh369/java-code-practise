package org.example;

public class number_decreasingpatern {
    public static void main(String[]args){
//        the value print like this
//        1  2  3  4  5  6  7  8
//        1  2  3  4  5  6  7
//        1  2  3  4  5  6
//        1  2  3  4  5
//        1  2  3  4
//        1  2  3
//        1  2
//        1



        int i,j,n=8;
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(j + "  ");
            }
            System.out.println("  ");
        }
    }
}
