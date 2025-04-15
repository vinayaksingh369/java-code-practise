package org.example;

public class Practise4 {
//    bitwise and or xor practise
    public static void main(String[] args){
        int x= 5;
        int y = 8;
        System.out.println("x & Y = " + (x & y)); //and
        System.out.println("x | Y = " +(x | y)); // or
        System.out.println("x ^ Y= "+ (x ^ y)); // Xor
// swap two number
        int a = 49, b = 50;
        a = a ^ b;
      b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);

        





    }
}
