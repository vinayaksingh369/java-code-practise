package org.example;

public class countSetbits {
    //        Write a program to count the number of bits set to 1 in an integer.

    public static int countBits(int n){
        int count = 0;
        while (n>0){
            n&=(n-1);count++;
        }
        return count;
    }
    public static void main(String[] args){
        int number = 125;
        System.out.println("set bit Count: " + countBits(number));
    }
}
