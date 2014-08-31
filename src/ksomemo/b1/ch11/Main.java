package ksomemo.b1.ch11;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(1.2, 3.4));
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1.2, 3.4, 5.6));
    }

    private static double sum(int a, int b) {
        return a + b;
    }

    private static double sum(double a, double b) {
        return a + b;
    }

    private static double sum(Integer... nums) {
        return Stream.of(nums).reduce(0, (a, b) -> (a + b));
    }

    private static double sum(Double... nums) {
        return Arrays.stream(nums).reduce(0.0, (a, b) -> (a + b));
    }
}
