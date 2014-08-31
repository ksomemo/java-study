package ksomemo.b1.ch14;

class Extend extends Abstract implements Interface {
    public void display() {
        System.out.printf("[a, b:%d, %d]\n", a, b);
    }

    @Override
    public int twiceZ() {
        return z * 2;
    }
}
