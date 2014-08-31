package ksomemo.b1.ch18;

import java.io.*;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        String filepath = "file.txt";

        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filepath)));
            try {
                IntStream.range(1, 9).forEach(writer::println);

            } finally {
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {

            reader.lines().forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
