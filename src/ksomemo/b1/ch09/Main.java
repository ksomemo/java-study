package ksomemo.b1.ch09;

class Main {
    public static void main(String[] args) {
        int a[] = new int[5];
        int b[] = {1,2,3,4,5};
        int[] c = new int[a.length * 2];
        int d[][] = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };

        // for loop をintellijに直された
        System.arraycopy(b, 0, a, 0, a.length);

        for (int n: a) {
            n = 3;
        }
        for (int n: a) {
            // 変更されない
            System.out.print(n + ",");
        }
        System.out.println("");

        System.out.println(c.length);

        for (int[] x: d) {
            x[0] += 10;
        }
        for (int[] x: d) {
            for (int n: x) {
                // 変更される
                System.out.print(n + ",");
            }
            System.out.println("");
        }
    }
}
