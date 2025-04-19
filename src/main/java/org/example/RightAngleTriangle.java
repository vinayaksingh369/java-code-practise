package org.example;

public class RightAngleTriangle {
    public static void main(String[] args) {

        int len = 3;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {

//                if (len %2 == 0) {
                    if ( j<i || j>=len-i-1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
//                } else {
//                    if ( j<i || j>=len-i) {
//                        System.out.print(" ");
//                    } else {
//                        System.out.print("*");
//                    }
//                }


            }
            System.out.println("");
        }
    }
}
