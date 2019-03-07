package last.homework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class OutputAtFile {

    private TimePeriod timePeriod;
    private Time time;
    private NameOfActivity nameOfActivity;

    public OutputAtFile(TimePeriod timePeriod, Time time, NameOfActivity nameOfActivity) {
        this.timePeriod = timePeriod;
        this.time = time;
        this.nameOfActivity = nameOfActivity;
    }


    public void writeAtFile (){

        this.timePeriod.allTimePeriod(this.time,this.nameOfActivity);

        Path writePath = Paths.get("Log", "TimePeriod.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(writePath.toFile()))) {
            writer.write(timePeriod.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
