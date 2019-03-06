package last.homework;

import java.util.LinkedList;
import java.util.List;

public class Time {
    List<String> timeList=new LinkedList<>();

    public Time() {
    }

    public void addAtTimeList (String string){
        this.timeList.add(string);
    }

    public List<String> getTimeList() {
        return this.timeList;
    }

    @Override
    public String toString() {
        return this.timeList.toString();
    }
}
