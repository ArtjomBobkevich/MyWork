import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Task2 {

    public static void main(String[] args) throws IOException {

        CreateSortRandomValue();
    }

    private static void CreateSortRandomValue() throws IOException {

        int[] array = new int[25];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        Path writePath = Paths.get("poem", "Task2RandomValues.txt");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(writePath.toFile()))) {
            for (int anArray : array) {
                String str = Integer.toString(anArray);
                bufferedWriter.write(str + " ");
            }
        }
        Path path = Paths.get("poem", "Task2RandomValues.txt");
        List<Integer> values = new ArrayList<>();
        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(path.toFile())))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] splittLine = line.split(" ");
                values = Arrays.stream(splittLine)
                        .map(Integer::valueOf)
                        .sorted()
                        .collect(Collectors.toList());
            }
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path.toFile()))) {
            for (Integer value : values) {
                String result = value + "\r\n";
                bufferedWriter.write(result);
            }
        }
    }
}