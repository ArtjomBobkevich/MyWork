package lesson16;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class BufferReader {

    public BufferReader() {
    }

    public static void reader() throws IOException {
        Path path = Paths.get("create project", "log.txt");
        try (Scanner fileReader = new Scanner(new BufferedInputStream(new FileInputStream(path.toFile())))) {

        }
    }
}
