package streamv3.homework;

public class Winner {
    private Scientist scientist1;
    private Scientist scientist2;

    public Winner(Scientist scientist1,Scientist scientist2) {
        this.scientist1=scientist1;
        this.scientist2=scientist2;
    }

    public boolean whoIsWinner (){
        return this.scientist1.valuePreparedRobots() > scientist2.valuePreparedRobots();
    }
}
