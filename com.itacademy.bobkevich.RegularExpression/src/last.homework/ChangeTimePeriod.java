package last.homework;

import java.util.LinkedList;
import java.util.List;

public class ChangeTimePeriod {

    private List<Integer>allActivityAtMinutes  = new LinkedList<>();
    private NameOfActivity nameOfActivity;



    public ChangeTimePeriod(NameOfActivity nameOfActivity) {
        this.nameOfActivity=nameOfActivity;
    }

    public void changeAllTimePeriod (ChangeTime changeTime, NameOfActivity nameOfActivity) {
        for (int counter=0;counter<changeTime.getChangeTime().size();counter++) {
            if (!nameOfActivity.getListAllActivity().get(counter).equals("Конец")) {
                this.allActivityAtMinutes.add(changeTime.getChangeTime().get(counter + 1) - changeTime.getChangeTime().get(counter));
            }
        }
    }

    public Integer sumAllTimeActivity (){
        int sumOfTimeAllActivity=0;
        for (int counter =0; counter<this.allActivityAtMinutes.size();counter++){
            int value=this.allActivityAtMinutes.get(counter);
            sumOfTimeAllActivity=sumOfTimeAllActivity+value;
        }
        return sumOfTimeAllActivity;
    }

    public Integer sumAllTimeOfIntroduction (){
        int sumOfTime=0;
        String introduction="введение";
        for (int counter=0; counter<nameOfActivity.getListAllActivityWithoutEnd().size();counter++){
            String stringToLowerCase=nameOfActivity.getListAllActivityWithoutEnd().get(counter).toLowerCase();
            if (stringToLowerCase.contains(introduction)){
                int value=allActivityAtMinutes.get(counter);
                sumOfTime=sumOfTime+value;
                System.out.println(counter);
            }
        }
       return sumOfTime;
    }

    @Override
    public String toString() {
        return allActivityAtMinutes.toString();
    }
}