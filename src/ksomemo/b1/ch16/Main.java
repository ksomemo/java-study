package ksomemo.b1.ch16;

import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        int cnt = 10;
        MyThread t = new MyThread(cnt);
        t.start();
        new Thread(new MyRun(t)).start();

        for (int i: IntStream.rangeClosed(1, cnt).toArray()) {
            System.out.println("main" + i);
            try {
                Thread.sleep(cnt, cnt);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
