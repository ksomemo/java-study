package ksomemo.b1.ch12;

class Main {
    public static void main(String[] args) {
        Klass k1 = new Klass();
        Klass k2 = new Klass();
        Klass k3 = new Klass(100, 200, 300);

        k1.display();
        k2.display();
        k3.display();

        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);

        System.out.println(k1 == k2);
        System.out.println(k1.equals(k2));

        k1.a += 10;
        k1.setB(k1.getB() + 10);

        System.out.println(k1 == k2);
        System.out.println(k1.equals(k2));
        k1.display();
        System.out.println(k1);
    }
}
