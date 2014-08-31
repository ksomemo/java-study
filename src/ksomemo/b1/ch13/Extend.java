package ksomemo.b1.ch13;

import ksomemo.b1.ch12.Klass;

public class Extend extends Klass {
    public int e = 5;

    public Extend() {
        super();
    }

    public Extend(int a, int b, int c, int e) {
        super(a, b, c);
        this.e = e;
    }

    @Override
    public void display() {
        System.out.printf("[e:%d]", e);
        super.display();
    }
}
