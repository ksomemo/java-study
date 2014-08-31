package ksomemo.b1.ch11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(1.2, 3.4));
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1.2, 3.4, 5.6));

        int[] nums = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.stream(nums).sum());

        List<Integer> numList = Arrays.asList(1, 2, 3, 4);
        numList.stream().map(n -> n * 2).forEach(System.out::print);
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
