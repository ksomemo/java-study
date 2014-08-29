package ksomemo.b1.ch05;

/**
 * @author ksomemo
 * @deprecated
 * @see
 * @serial
 * @since 2014-08-30
 * @version 1.0.0
 */
public class Main {
    /**
     * @param args
     * @exception
     * @serialData
     * @throws
     * @return
     */
    public static void main(String[] args) {
        // 使えるコメントとdocコメントを試している
        int x, y;
        int sum;
        x = y =100;
        sum = x + y;

        System.out.println(String.format("x = %d, y = %d", x, y));
        System.out.println("x + y =" + sum);

        int target = 1;
        for (int i=0; i<3; i++) {
            System.out.print(i + ":");
            if (i < target) {
                System.out.println("less than.");
            } else if (i == target) {
                System.out.println("equal.");
            } else {
                System.out.println("more than");
            }
        }
    }
}
