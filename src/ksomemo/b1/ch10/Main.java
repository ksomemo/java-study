package ksomemo.b1.ch10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print(">input:");
        System.out.println("input is " + br.readLine());

        System.out.println(Integer.parseInt("100"));
        System.out.println(Double.parseDouble("100.0"));

        try {
            Integer.parseInt("a");
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
            System.err.println(e); // e.getStackTrace()
        }

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(",");
        while (sc.hasNext()) {
            String s = sc.next();
            System.out.println("s:" + s);

            if (s.equals("end")) break;
        }
    }
}
