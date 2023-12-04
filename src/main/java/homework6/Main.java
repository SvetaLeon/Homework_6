package homework6;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Writer writer = new FileWriter("src/main/java/homework6/log.txt");
        writer.write("INFO: Starting JuniorCrudServiceApplication using Java 17.0.7 \n" +
                "DEBUG: User admin created");
        writer.close();

        Reader reader = new FileReader("src/main/java/homework6/log.txt");
        int data = reader.read();
        while (data != -1) {
            System.out.print((char) data);
            data = reader.read();
        }
        System.out.println();
        reader.close();

        System.out.println();
        getLog("DEBUG");
        getLog("INFO");
    }

    public static void getLog(String logLevel) throws IOException {
        Reader reader = new FileReader("src/main/java/homework6/log.txt");
        Scanner scan = new Scanner(reader);
        String data1 = scan.nextLine();
        String data2 = scan.nextLine();

        if ("INFO".equals(logLevel)) {
            String[] array = data1.split("I");
            String result = "";
            for (String s : array) {
                result += s;
            }
            System.out.println("I" + result);
        }
        if (("DEBUG".equals(logLevel))) {
            String[] array = data2.split("D");
            String result = "";
            for (String s : array) {
                result += s;
            }
            System.out.println("D" + result);
        }
    }
}
