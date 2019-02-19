import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static java.nio.file.StandardOpenOption.CREATE;

public class Task1 {

    public static void main(String[] args) throws IOException {

        File file = Paths.get("poem", "monument.txt").toFile();
        Map<Character, Integer> map = new HashMap<>();
        try (FileReader scanner = new FileReader(file)) {
            int c;
            int value = 1;
            int oldValue;
            while ((c = scanner.read()) != -1) {     /* не корректно подсчитывает кол-во букв*/
                if (isCharactedCounted((char) c)) {
                    if (map.containsKey((char) c)) {
                        oldValue = map.get(Character.toLowerCase((char) c));
                        map.put(Character.toLowerCase((char) c), value + oldValue);
                    } else {
                        map.put(Character.toLowerCase((char) c), value);
                    }
                }
            }
        }
        System.out.println(map.entrySet());
        String result = map.entrySet() + "";
        Path writePath = Paths.get("poem", "ValueChar.txt");
        Files.write(writePath, result.getBytes(StandardCharsets.UTF_8), CREATE);
    }

    public static boolean isCharactedCounted (Character c){
        if (c!=' '&c!=','&c!='.'&c!='-'&c!='—'&c!='\uFEFF'&c!=';'){
            return true;
        }
        return false;
    }
}