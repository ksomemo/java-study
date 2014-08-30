package ksomemo.b1.ch06;

public class Color {

    enum colors {
        RED("aka",1),
        GREEN("midori", 3),
        BLUE("ao",5);

        private String kana;
        private int number;

        private colors(String kana, int number) {
            this.kana = kana;
            this.number = number;
        }

        @Override
        public String toString() {
            return method();
        }

        public String method() {
            return String.format("[%s:%s]", kana, number);
        }
    }
}
