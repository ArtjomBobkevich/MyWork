package last.homework;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Time {

    List<String> timeList;

    public void addAtTimeList (String string){
        this.timeList.add(string);
    }

    @Override
    public String toString() {
        return this.timeList.toString();
    }
}
