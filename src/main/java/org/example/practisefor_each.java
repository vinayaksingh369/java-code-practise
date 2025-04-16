package org.example;

public class practisefor_each {
    public static void main(String[]args){
//        String[] cars= {"volvo","bmw","ford","nisan"};
//        for (String i :cars){
//            System.out.println(i);
//        }
        for (int o= 0;o<10;o++){
            if(o==9){
                break;
            }
            System.out.println(o);
        }
        System.out.println("__________");
        int e=0;
        while (e<10){
            System.out.println(e);
            e++;
            if(e==5){
                break;
            }
            System.out.println("_____++++++++++________");
            for (int p = 0;p<10;p++){
                if(p==4){
                    continue;
                }
                System.out.println(p);
            }
            System.out.println(":::::::::::::::::::::");
            int r=0;
            while(r<10){
                if(r==4){
                    r++;
                    continue;
                }
                System.out.println(r);
                r++;
            }
        }
    }
}
