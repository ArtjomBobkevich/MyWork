import java.util.Comparator;

public class ValueAComparator implements Comparator<Task1> {

    @Override
    public int compare(Task1 o1, Task1 o2) {
        return Integer.compare(o1.getValueB(),o2.getValueB());
    }
}
