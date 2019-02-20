import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static java.nio.file.StandardOpenOption.CREATE;

public class Task1 {

    public static void main(String[] args) throws IOException {

    task1();
    }

    public static void task1 () throws IOException{
        File file = Paths.get("poem", "monument.txt").toFile();
        Map<Character, Integer> map = new HashMap<>();
        try (FileReader scanner = new FileReader(file)) {
            int symbol;
            int counter = 1;
            int oldValue;
            while ((symbol = scanner.read()) != -1) {
                if (isCharactedLetter((char) symbol)) {
                    if (map.containsKey((char) symbol)) {
                        oldValue = map.get((char) symbol);
                        map.put((char) symbol, counter + oldValue);
                    } else {
                        map.put((char) symbol, counter);
                    }
                }
            }
        }
        System.out.println(map.entrySet());
        String result = map.entrySet() + "";
        Path writePath = Paths.get("poem", "ValueChar.txt");
        Files.write(writePath, result.getBytes(StandardCharsets.UTF_8), CREATE);
    }

    private static boolean isCharactedLetter (Character c){
        if (c!=' '&c!=','&c!='.'&c!='-'&c!='—'&c!='\uFEFF'&c!=';'){  /* не все уберает + регистр*/
            return true;
        }
        return false;
    }

}