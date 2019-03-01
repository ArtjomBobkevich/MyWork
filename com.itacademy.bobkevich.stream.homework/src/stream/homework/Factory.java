package stream.homework;


import java.util.Random;

public class Factory {

    private static final RobotDetails [] DETAILS=RobotDetails.values();
    private static final int SIZE =DETAILS.length;
    private static final Random RANDOM=new Random();

    public Factory() {
    }

    public static RobotDetails getFactoryRandomDetails () {
        return DETAILS[RANDOM.nextInt(SIZE)];
    }
}