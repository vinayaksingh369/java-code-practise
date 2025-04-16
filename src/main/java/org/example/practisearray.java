package org.example;

public class practisearray {
    public static void main(String[]args){
        int []ages = {12,34,54,32,21,43,98};
        int length = ages.length;
        int lowestAge = ages [0];
        for(int age:ages){
            if (lowestAge>age){
                lowestAge =age;
            }
        }
        System.out.println("the lowest age inthe array is: " + lowestAge);
    }
}
