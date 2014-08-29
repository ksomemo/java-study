package ksomemo.b1.ch07;

public class Main {
    public static void main(String[] args) {
        int x = 10, y = 3;
        double z = 3.0;

        System.out.printf("x %% y = %d\n", (x % y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x / z = " + (x / z));


        String a = "a";
        String c1 = "c";
        String c2 = "c";

        if (c1 == c2) System.out.println("c1 is c2");
        if (a.equals(c1.replace('c', 'a'))) System.out.println("a.value is c.replace.value");
        if (c1 == c1.replace('b', 'a')) System.out.println("c is c.no_replace");
        if (c1 == c1.replace('c', 'c')) System.out.println("c is c.replace");


        boolean aOnly = boolAndPrint(false, a) && boolAndPrint(true, "b");
        boolean cOnly = boolAndPrint(true, c1) || boolAndPrint(true, "d");
    }

    public static boolean boolAndPrint(boolean b, String str) {
        System.out.println(str);
        return b;
    }
}
