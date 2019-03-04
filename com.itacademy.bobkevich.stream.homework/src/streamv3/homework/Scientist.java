package streamv3.homework;

import java.util.HashMap;
import java.util.Map;

public class Scientist {

    private  HashMap<RobotDetails,Integer> scientist;

    public Scientist(HashMap<RobotDetails, Integer> scientist) {
        this.scientist = scientist;
    }

    public void getRobotDatails(RobotDetails... robotDetails) {
        for (RobotDetails robotDetails1 : robotDetails) {
            if (scientist.containsKey(robotDetails1)) {
                scientist.put(robotDetails1, scientist.get(robotDetails1) + 1);
            } else {
                scientist.put(robotDetails1, 1);
            }
        }
    }

    public  void allRobots (){
        Map<RobotDetails,Integer>robotDatailsByScientist=getScientist();
        if (robotDatailsByScientist.size()==9){
            //ищем меньшее число из всех и столько у нас роботов
        }
    }

    public HashMap<RobotDetails, Integer> getScientist() {
        return scientist;
    }
}
