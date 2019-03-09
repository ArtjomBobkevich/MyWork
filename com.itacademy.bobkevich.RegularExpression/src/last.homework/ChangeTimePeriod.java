package last.homework;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ChangeTimePeriod {

    private List<Integer> allActivityAtMinutes;
    private NameOfActivity nameOfActivity;

    public void changeAllTimePeriod(ChangeTime changeTime, NameOfActivity nameOfActivity) {
        for (int counter = 0; counter < changeTime.getChangeTime().size(); counter++) {
            if (!nameOfActivity.getListAllActivity().get(counter).equals("Конец")) {
                this.allActivityAtMinutes.add(changeTime.getChangeTime().get(counter + 1) - changeTime.getChangeTime().get(counter));
            }
        }
    }

    public Integer sumAllTimeActivity() {
        int sumOfTimeAllActivity = 0;
        for (int counter = 0; counter < this.allActivityAtMinutes.size(); counter++) {
            int value = this.allActivityAtMinutes.get(counter);
            sumOfTimeAllActivity = sumOfTimeAllActivity + value;
        }
        return sumOfTimeAllActivity;
    }

    public Integer sumAllTimeOfThisActivity(String activity) {
        int sumOfTime = 0;
        for (int counter = 0; counter < nameOfActivity.getListAllActivityWithoutEnd().size(); counter++) {
            String stringToLowerCase = nameOfActivity.getListAllActivityWithoutEnd().get(counter).toLowerCase();
            if (stringToLowerCase.contains(activity)) {
                int value = allActivityAtMinutes.get(counter);
                sumOfTime = sumOfTime + value;
            }
        }
        return sumOfTime;
    }

    public Integer sumAllTimeLectures (){
        int sum=0;
        for (int counter=0; counter<nameOfActivity.getListAllActivityWithoutEnd().size();counter++) {
            String stringToLowerCase = nameOfActivity.getListAllActivityWithoutEnd().get(counter).toLowerCase();
            if (stringToLowerCase.contains("скаляр")||stringToLowerCase.contains("введение")||stringToLowerCase.contains("массив")){
                int value=allActivityAtMinutes.get(counter);
                sum=sum+value;
            }
        }
        return sum;
    }

    @Override
    public String toString() {
        return allActivityAtMinutes.toString()+sumAllTimeLectures();
    }
}