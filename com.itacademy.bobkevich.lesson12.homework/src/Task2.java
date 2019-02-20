import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;

import static java.nio.file.StandardOpenOption.CREATE;

public class Task2 {

    public static void main(String[] args) throws IOException {

        int[] array = new int[25];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        try (final FileWriter writer = new FileWriter("D:\\GitHub\\MyWork\\com.itacademy.bobkevich.lesson12.homework\\poem\\Task2Output.txt", false)) {
            for (int i = 0; i < array.length; i++) {
                String str = Integer.toString(array[i]);
                writer.write(str + " ");
                System.out.println(str);
            }
        }
        File file = Paths.get("poem", "Task2Output.txt").toFile();
        try (FileReader scanner = new FileReader(file)) {
            int str;
            int [] arrays=new int[array.length];
            int i=0;
            while ((str = scanner.read()) != -1) {
                System.out.println((char) str);
                arrays[i]=Character.digit((char)str,2500);
                i++;
            }
            System.out.println(Arrays.toString(arrays));
        }
    }
}

