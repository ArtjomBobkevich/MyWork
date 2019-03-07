package last.homework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Input {

    public Input() {
    }

    public String  getInformation () throws IOException {
        Path readPath = Paths.get("Log", "log-file.txt");

        byte[] bytes = Files.readAllBytes(readPath);
        return new String(bytes);
    }

    public void giveInformationAtList (Time time,NameOfActivity nameOfActivity) throws IOException {

        String regexpDate = "\\d\\d:\\d\\d";
        String regexpString = "(([а-яА-ЯёЁ]+).*)";

        Pattern pattern1 = Pattern.compile(regexpDate);
        Matcher matcher1 = pattern1.matcher(getInformation());

        Pattern pattern2 = Pattern.compile(regexpString);
        Matcher matcher2 = pattern2.matcher(getInformation());

        while (matcher1.find()) {
            time.addAtTimeList(matcher1.group());
        }
        while (matcher2.find()) {
            nameOfActivity.addAtListActivity(matcher2.group());
            nameOfActivity.addAtListActivityWithoutEnd(matcher2.group());
        }
    }
}
