package streamv3.homework;

public class Night extends Thread{

    private Integer night;

    public Night(Integer night) {
        this.night = night;
    }

    public Integer getNight() {
        return night;
    }

    public void setNight(Integer night) {
        this.night = this.night-night;
    }
}
