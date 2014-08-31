package ksomemo.b1.ch14;

class Main {
    public static void main(String[] args) {
        Abstract ext = new Extend();
        Interface i = new Extend();

        ext.display();
        i.displayTwice();
    }
}
