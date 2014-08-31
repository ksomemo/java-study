package ksomemo.b1.ch13;

import ksomemo.b1.ch12.Klass;

class Main {
    public static void main(String[] args) {
        Extend ext = new Extend();
        Klass  k   = new Extend(100, 200, 300, 500);

        ext.display();
        k.display();
    }
}


