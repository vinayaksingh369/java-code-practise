package org.example;

public class Practise1 {
    public static <Char> void main(String[] args) {
//        byte range lowest and highest value checker
        System.out.println("Byte Range:");
        System.out.println("____________");
        byte a = 127;
        System.out.println("Example byte value: "+ a);
        System.out.println("Minimum byte value: " + Byte.MIN_VALUE);
        System.out.println("Maximum byte value: " + Byte.MAX_VALUE);
        System.out.println();
//        short range lowest and highest value checker
        System.out.println("Short Range:");
        System.out.println("______________");
        short b = 2;
        System.out.println("Example of short value :" + b);
        System.out.println("minimum short value :" + Short.MIN_VALUE);
        System.out.println("maximum Short value: " + Short.MAX_VALUE);
//        INT RANGE LOWEST AND HIGHEST VALUE CHECKER
        System.out.println("integer range: ");
        System.out.println("------------------");
        int c = 4;
        System.out.println("minimum Integer  value: " +Integer.MIN_VALUE);
        System.out.println("maximum Integer value " +Integer.MAX_VALUE);
//        long  Range lowest and higest value checker
        System.out.println("long range: ");
        System.out.println("_________");
        long d = 5;
        System.out.println("maximum long value:" +Long.MIN_VALUE);
        System.out.println("maximum long value:" +Long.MAX_VALUE);

//        float highest and lowest range
        float e = 123.242344f;
        System.out.println("Float Example:");
        System.out.println("---------------");
        System.out.println("Orignal Float value:" +e);
        System.out.println("Smallest positive float: "+Float.MIN_VALUE);
        System.out.println("largest Positive Float: " + Float.MAX_VALUE);
        System.out.println("Smallest Neagtive float: -" + Float.MIN_VALUE);
        System.out.println("largest Negative float: -"  + Float.MAX_VALUE);
        System.out.println();
//        Double highest and lowest value
        double f = 6;
        System.out.println("Double Example: ");
        System.out.println("--------------");
        System.out.println("Orignal Double value: " +f);
        System.out.println("Smallest Positve Double: " +Double.MIN_VALUE);
        System.out.println("Largest Positve Double: "+Double.MAX_VALUE);
        System.out.println("Smallest negative value: -" +Double.MIN_VALUE);
        System.out.println("Largest neagtive value: -" +Double.MAX_VALUE);
        System.out.println();

//        booolean

//       typecasting
        char l = 'n';
        System.out.println((int)l);
//     character highest and lowest value
        System.out.println("Character Range: ");
        System.out.println("_______________");
        System.out.println("Minimum value :" + (int) Character.MIN_VALUE);
        System.out.println("Maxmium value :" +(int) Character.MAX_VALUE);
        System.out.println((char) 10855);
        System.out.println((char) 110);

//        Conversion
        System.out.println("_______-");
        byte bytevalue = 10;
        short shortvalue = bytevalue;
        int intvalue = shortvalue;
        long longvalue = intvalue;
        float floatvalue = longvalue;
        double doublevalue = floatvalue;
        System.out.println("int: " + intvalue);
        System.out.println("long: " + longvalue);
        System.out.println("float: " + floatvalue);
        System.out.println("double: " + doublevalue);
        System.out.println();
    }
}
