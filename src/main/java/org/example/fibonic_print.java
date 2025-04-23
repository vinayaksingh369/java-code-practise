package org.example;

public class fibonic_print {
    public static void main(String[]args){
        int i,n=30;
        int f=0,s=1;
        System.out.print("frirst"+n+"terms");
        for(i=0;i<=n;++i){
            System.out.print(f +" ");
            int next =f+s;
            f = s;
            s = next;
        }
    }
}
