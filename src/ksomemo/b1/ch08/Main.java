package ksomemo.b1.ch08;

import static ksomemo.b1.ch06.Color.colors;

class Main {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            i++;

            if (i == 2) continue;
            if (i == 4) break;
            System.out.println("while:" + i);
        }

        label: for (int k = 0; k < 3; k++) {
            System.out.println("outer:" + k);
            for (int j = 0; j < 3; j++) {
                System.out.println("inner:" + j);
                if (k == 0) continue label;
                if (j == 1) break label;
            }
        }

        do {
            System.out.println("do while:" + i);
        } while (i < 3);

        colors green = colors.GREEN;
        switch (green) {
            case RED:
                System.out.println("R");
                break;
            case GREEN:
                System.out.println("G");
                break;
            case BLUE:
                System.out.println("B");
                break;
            default:
                System.out.println("default");
                break;
        }

        String compareSwitch = "switch";
        switch (compareSwitch) {
            case "compare":
                System.out.println("compare");
                break;
            case "switch":
                System.out.println("switch and fall through");
            default:
                System.out.println("default");
                break;
        }
    }
}
