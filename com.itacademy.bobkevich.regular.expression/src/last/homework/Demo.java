package last.homework;

import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException {
        ChangeTime changeTime = new ChangeTime();
        TimePeriod timePeriod=new TimePeriod(new StringBuffer());
        Time time =new Time();
        NameOfActivity nameOfActivity = new NameOfActivity();
        ChangeTimePeriod changeTimePeriod = new ChangeTimePeriod(nameOfActivity);
        Input input = new Input();
        OutputAtFile outputAtFile =new OutputAtFile(timePeriod,time,nameOfActivity);

        input.giveInformationAtList(time,nameOfActivity);
        changeTime.convertAllTime(time);
        changeTimePeriod.changeAllTimePeriod(changeTime,nameOfActivity);
        outputAtFile.writeAtFile();


        System.out.println(time);
        System.out.println(changeTime);
        System.out.println(changeTimePeriod);
        System.out.println("Всё время: "+changeTimePeriod.sumAllTimeActivity());
        System.out.println("Введение общее время: "+changeTimePeriod.sumAllTimeOfIntroduction());
        System.out.println(nameOfActivity);
    }
}