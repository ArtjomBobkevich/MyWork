package last.homework;

import lombok.AllArgsConstructor;

import java.util.LinkedList;
import java.util.List;

@AllArgsConstructor
public class Report {

    public static final int HUNDRED_PERCENT = 100;

    private StringBuffer report;
    private ChangeTimePeriod changeTimePeriod;

    public void createReport() {
        List<String>allLectures=new LinkedList<>();
        allLectures.add("Введение");
        allLectures.add("Массив");
        allLectures.add("Скаляры");
        List<String> allNameOfTimeSection=new LinkedList<>();
        allNameOfTimeSection.add("Перерыв");
        allNameOfTimeSection.add("Упражнения");
        allNameOfTimeSection.add("Решения");
        float procentOfThisTime = (float) changeTimePeriod.sumAllTimeActivity() / HUNDRED_PERCENT;
        String result = "Лекции: " + changeTimePeriod.sumAllTimeLectures()
                + " минут "
                + changeTimePeriod.sumAllTimeLectures() / procentOfThisTime
                + " %"
                + "\r\n";
        report.append(result);
        for (int counter=0; counter<allNameOfTimeSection.size();counter++) {
            result = allNameOfTimeSection.get(counter) + ": "
                    + changeTimePeriod.sumAllTimeOfThisActivity(allNameOfTimeSection.get(counter).toLowerCase())
                    + " минут "
                    + changeTimePeriod.sumAllTimeOfThisActivity(allNameOfTimeSection.get(counter).toLowerCase()) / procentOfThisTime
                    + " %"
                    + "\r\n";
            report.append(result);
        }
        result="Лекции: "+ "\r\n";
        report.append(result);
        for (int counter=0; counter<allLectures.size();counter++) {
            result = allLectures.get(counter) + ": "
                    + changeTimePeriod.sumAllTimeOfThisActivity(allLectures.get(counter).toLowerCase())
                    + " минут "
                    + changeTimePeriod.sumAllTimeOfThisActivity(allLectures.get(counter).toLowerCase()) / procentOfThisTime
                    + " %"
                    + "\r\n";
            report.append(result);
        }
    }

    @Override
    public String toString() {
        return report.toString();
    }
}