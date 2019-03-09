package streamv3.homework;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class Scientist {

    private  Map<RobotDetails,Integer> scientist;

    public Scientist(Map<RobotDetails, Integer> scientist) {
        this.scientist = scientist;
    }

    public void getRobotDatails(Map<RobotDetails,Integer>robotDetailsByMinion) {
        Set<Map.Entry<RobotDetails,Integer>> entries=robotDetailsByMinion.entrySet();
            for (Map.Entry<RobotDetails,Integer>entry:entries){
                scientist.merge(entry.getKey(), 1, (a, b) -> a + b);
            }
    }

    public Integer valuePreparedRobots (){
        int amountRobots=0;
        if (this.scientist.size()==9){
            amountRobots=Collections.min(scientist.values());
        }
        return amountRobots;
    }

    public Map<RobotDetails, Integer> getScientist() {
        return scientist;
    }

    @Override
    public String toString() {
        return valuePreparedRobots()+" Роботов, а деталей всего: " +scientist;
    }
}
