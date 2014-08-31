package ksomemo.b1.ch11;

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
        double sum = 0;
        for (double n: nums) {
            sum += n;
        }
        return sum;
    }

    private static double sum(Double... nums) {
        double sum = 0;
        for (double n: nums) {
            sum += n;
        }
        return sum;
    }

}
