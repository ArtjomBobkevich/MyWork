import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

import static java.nio.file.StandardOpenOption.CREATE;

public class Task1 {

    private static final String LETTERS = "абвгдеёжзийклмнопрстуфхчцшщъыьэюя";

    public static void main(String[] args) throws IOException {

        inputAndOutputPoem();
    }

    public static void inputAndOutputPoem() throws IOException {

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
        List <Map.Entry <String, Integer >> comparingByKey = map .entrySet ()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toList ());
        String result = comparingByKey + "";
        Path writePath = Paths.get("poem", "AllLettersInPoem.txt");
        Files.write(writePath, result.getBytes(StandardCharsets.UTF_8), CREATE);
    }

    private static boolean isValue (String word){
        return LETTERS.contains(word);
    }
}
