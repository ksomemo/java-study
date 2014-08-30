package ksomemo.b1.ch06;

public class Main {
    public static void main(String[] args) {
        System.out.println("c,c.name()");
        for (Color.colors c : Color.colors.values()) {
            System.out.println(String.format("=>%s,%s", c, c.name()));
        }

        final int MAX_LEN = 3;
        if (MAX_LEN == Color.colors.values().length) {
            System.out.println("colors's length is MAX_LEN");
        }

        System.out.println("\u1000");
        System.out.println("\110");
        System.out.println("\\");

        System.out.println(123L);
        System.out.println(456.789F);
        System.out.println(010);
        System.out.println(0x10);
        System.out.println(5.0e3);
        System.out.println((int) 1.01);
    }
}
