package org.example;

public class practisemultiarray {
    public static void main(String[]args){
        int[][] mynum = {{1,2,3,4,5},{3,3,4,5,5,6}};
        for (int[] row:mynum){
            for(int i:row){
                System.out.println(i);
            }
        }
    }
}
