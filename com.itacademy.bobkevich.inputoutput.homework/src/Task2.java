import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

import static java.nio.file.StandardOpenOption.CREATE;

public class Task2 {

    public static void main(String[] args) throws IOException {

        CreateSortRandomValue();
    }

    public static void CreateSortRandomValue() throws IOException {

        int[] array = new int[25];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        Path writePath = Paths.get("poem", "Task2RandomValues.txt");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(writePath.toFile()))) {
            for (int i = 0; i < array.length; i++) {
                String str = Integer.toString(array[i]);
                bufferedWriter.write(str + " ");
            }
        }
        Path path = Paths.get("poem", "Task2RandomValues.txt");
        String result = "";
        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(path.toFile())))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] splittLine = line.split(" ");
                List<Integer> values = Arrays.stream(splittLine)
                        .map(Integer::valueOf)
                        .sorted(Collections.reverseOrder())
                        .collect(Collectors.toList());
                result = values + "";
            }
        }
        Path writePath2 = Paths.get("poem", "Task2SortRandomValues.txt");
        Files.write(writePath2, result.getBytes(StandardCharsets.UTF_8), CREATE);
    }
}