import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Task1 {

    private static final String LETTERS = "абвгдеёжзийклмнопрстуфхчцшщъыьэюя";

    public static void main(String[] args) throws IOException {

        inputAndOutputPoem();
    }

    private static void inputAndOutputPoem() throws IOException {

        File file = Paths.get("poem", "monument.txt").toFile();
        Map<String, Integer> map = new HashMap<>();
        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(file)))) {
            int oldValue;
            scanner.useDelimiter("");
            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase();
                if (isValue(word)) {
                    if (map.containsKey(word)) {
                        oldValue = map.get(word);
                        map.put(word, oldValue + 1);
                    } else {
                        map.put(word, 1);
                    }
                }
            }
        }
        List<String> listKey = map.keySet()
                .stream()
                .sorted()
                .collect(Collectors.toList());
        Path writePath = Paths.get("poem", "AllLettersInPoem.txt");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(writePath.toFile()))) {
            for (String aListKey : listKey) {
                String result = aListKey + "-" + map.get(aListKey) + "\r\n" + "\r\n";
                bufferedWriter.write(result);
            }
        }
    }

    private static boolean isValue(String word) {
        return LETTERS.contains(word);
    }
}