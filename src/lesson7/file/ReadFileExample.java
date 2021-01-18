package lesson7.file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadFileExample {

    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Path.of("text.txt"));
        for (String line : lines) {
            System.out.println(line);
        }

        System.out.println("-------");

//        FileInputStream fileInputStream = new FileInputStream("text.txt");
        BufferedInputStream fileInputStream = new BufferedInputStream(
                new FileInputStream("text.txt"));
//        byte[] bytes = fileInputStream.readAllBytes();
//        System.out.println(new String(bytes));

        byte[] data = new byte[fileInputStream.available()];
        int count = 0;
        int buf;
        while ((buf = fileInputStream.read()) != -1) {
            data[count++] = (byte) buf;
        }

        System.out.println(new String(data));
    }
}
