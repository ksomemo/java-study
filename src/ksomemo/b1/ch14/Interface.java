package ksomemo.b1.ch14;

interface Interface {
    int z = 26;

    default void displayTwice() {
        System.out.println(twiceZ());
    }

    int twiceZ();
}
