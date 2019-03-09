package last.homework;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Demo {

    public static void main(String[] args) throws IOException {
        List<Integer>changeTimeStringToInt=new LinkedList<>();
        List<String > timeList=new LinkedList<>();
        List<String> listAllActivity=new LinkedList<>();
        List<String> listAllActivityWithoutEnd=new LinkedList<>();
        List<Integer>allActivityAtMinutes=new LinkedList<>();
        StringBuffer informationForReport=new StringBuffer();
        ChangeTime changeTime = new ChangeTime(changeTimeStringToInt);
        TimePeriod timePeriod=new TimePeriod(new StringBuffer());
        Time time =new Time(timeList);
        NameOfActivity nameOfActivity = new NameOfActivity(listAllActivity,listAllActivityWithoutEnd);
        ChangeTimePeriod changeTimePeriod = new ChangeTimePeriod(allActivityAtMinutes,nameOfActivity);
        Input input = new Input();
        Report report=new Report(informationForReport,changeTimePeriod);
        OutputAtFile outputAtFile =new OutputAtFile(timePeriod,time,nameOfActivity,report);

        input.giveInformationAtList(time,nameOfActivity);
        changeTime.convertAllTime(time);
        changeTimePeriod.changeAllTimePeriod(changeTime,nameOfActivity);
        outputAtFile.writeAtFile();
    }
}