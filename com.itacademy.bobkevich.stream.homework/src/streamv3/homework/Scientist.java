package streamv3.homework;

import java.util.HashMap;

public class Scientist {

    private static HashMap<RobotDetails,Integer> scientist;

    public Scientist() {
        Scientist.scientist=new HashMap<>();
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

    public static HashMap<RobotDetails, Integer> getScientist() {
        return scientist;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
