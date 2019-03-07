package last.homework;

import java.util.List;

public class TimePeriod {

    private StringBuffer timePeriod;

    public TimePeriod(StringBuffer timePeriod) {
        this.timePeriod = timePeriod;
    }

    public void allTimePeriod (Time time,NameOfActivity nameOfActivity){
        String newValue;
        for (int counter=0;counter<time.getTimeList().size();counter++){
            if (!nameOfActivity.getListAllActivity().get(counter).equals("Конец")){
            newValue=time.getTimeList().get(counter)+"-"+time.getTimeList().get(counter+1)+" "+nameOfActivity.getListAllActivity().get(counter)+"\r\n";
            timePeriod=timePeriod.append(newValue);
        } else {
                newValue=time.getTimeList().get(counter)+" "+nameOfActivity.getListAllActivity().get(counter)+"\r\n"+"\r\n";
                timePeriod=timePeriod.append(newValue);
            }
        }
    }

    @Override
    public String toString() {
        return timePeriod.toString();
    }
}
