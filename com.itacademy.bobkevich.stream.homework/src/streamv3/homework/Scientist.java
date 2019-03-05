package streamv3.homework;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Scientist {

    private  Map<RobotDetails,Integer> scientist;

    public Scientist(Map<RobotDetails, Integer> scientist) {
        this.scientist = scientist;
    }

    public void getRobotDatails(Map<RobotDetails,Integer>robotDetailsByMinion) {   /*пробегает по переданной мапе и где добавляет ключ, а где значение*/
        Set<Map.Entry<RobotDetails,Integer>> entries=robotDetailsByMinion.entrySet();
            for (Map.Entry<RobotDetails,Integer>entry:entries){
                Integer amountDetailsByScientist = scientist.get(entry.getKey());
                if (amountDetailsByScientist==null){
                    scientist.put(entry.getKey(),entry.getValue());
                }else {
                    scientist.put(entry.getKey(),entry.getValue());
                }
            }
    }

    public Integer Robot (Map<RobotDetails,Integer> scientist){ /*условно собирает роботов, если в мапе есть 9 ключей, то наименьшее значение и будет кол-вом роботов*/
        int amountRobots=0;
        if (scientist.size()==9){
            amountRobots=Collections.max(scientist.values());
        }
        return amountRobots;
    }

    @Override
    public String toString() {
        return Robot(scientist)+" Роботов";
    }
}

//public void getRobotDatails(Map<RobotDetails,Integer>robotDetailsByMinion) {
//        Set<Map.Entry<RobotDetails,Integer>> entries=robotDetailsByMinion.entrySet();
//            for (Map.Entry<RobotDetails,Integer>entry:entries){
//                Integer amountDetailsByScientist = scientist.get(entry.getKey());
//                if (amountDetailsByScientist==null){
//                    scientist.put(entry.getKey(),entry.getValue());
//                }else {
//                    scientist.put(entry.getKey(),entry.getValue());
//                }
//            }
//    }