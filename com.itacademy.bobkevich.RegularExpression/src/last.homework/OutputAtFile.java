package last.homework;

import lombok.AllArgsConstructor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

@AllArgsConstructor
public class OutputAtFile {

    private TimePeriod timePeriod;
    private Time time;
    private NameOfActivity nameOfActivity;
    private Report report;

    public void writeAtFile (){

        timePeriod.allTimePeriod(time,nameOfActivity);

        report.createReport();

        Path writePath = Paths.get("Log", "TimePeriod.txt");
        Path writePath2 = Paths.get("Log", "report.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(writePath.toFile()))) {
            writer.write(timePeriod.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(writePath2.toFile()))) {
            writer.write(report.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
