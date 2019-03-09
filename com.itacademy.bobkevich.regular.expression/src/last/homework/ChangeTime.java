package last.homework;

import java.util.LinkedList;
import java.util.List;

public class ChangeTime {

    private final static Integer HOUR=60;

    private List<Integer> changeTime = new LinkedList<>();

    public ChangeTime() {

    }

    public Integer convertStringToInt (String string){
        Integer value = Integer.parseInt(string);
        return value;
    }

    public void convertAllTime (Time time){
        for (int counter=0;counter<time.getTimeList().size();counter++){
            String string=(time.getTimeList().get(counter));
            String delimeter= ":";
            String[]substr=string.split(delimeter);
            Integer value1=0;
            Integer value2=0;
            for (int counter2=0;counter2<substr.length;counter2++){
                if (counter2==0) {
                    value1= convertStringToInt(substr[counter2])*HOUR;
                }else {
                    value2=convertStringToInt(substr[counter2]);
                }
            }
            Integer result=value1+value2;
            this.changeTime.add(result);
        }
    }

    public List<Integer> getChangeTime() {
        return changeTime;
    }

    @Override
    public String toString() {
        return this.changeTime.toString();
    }
}