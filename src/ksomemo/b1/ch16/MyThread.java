package ksomemo.b1.ch16;

class MyThread extends Thread {
    private final int cnt;

    public MyThread(int cnt) {
        this.cnt = cnt;
    }

    public void run() {
        for (int i = 0; i < cnt; i++) {
            System.out.println("extends Thread" + i);
            try {
                Thread.sleep(cnt);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyRun implements Runnable {
    private final MyThread thread;

    public MyRun(MyThread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        thread.run();
    }
}
