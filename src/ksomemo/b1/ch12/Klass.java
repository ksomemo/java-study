package ksomemo.b1.ch12;

public class Klass {
    public int a = 1;
    private int b = 2;
    public int c = 3;
    public final int d = 4;

    public Klass() {
        // nothing
    }

    public Klass(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void display() {
        System.out.printf("a, b, c, d:%d, %d, %d, %d\n", a, b, c, d);
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    @Override
    public int hashCode() {
        return Integer.valueOf(
                String.valueOf(a) + String.valueOf(b) + String.valueOf(c) + String.valueOf(d)
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Klass) {
            Klass k = (Klass) obj;

            return a == k.a && b == k.getB() && c == k.c;
        }

        return false;
    }
}

