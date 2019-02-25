import java.util.Objects;

public class Task1 implements Comparable<Task1> {

    private int valueA;
    private int valueB;

    public Task1(int valueA, int valueB) {
        this.valueA = valueA;
        this.valueB = valueB;
    }

    @Override
    public int compareTo(Task1 o) {
        return Integer.compare(valueA, o.getValueA());
    }

    public int getValueA() {
        return valueA;
    }

    public int getValueB() {
        return valueB;
    }

    @Override
    public String toString() {
        return "Task1{" +
                "valueA=" + valueA +
                ", valueB=" + valueB +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task1)) return false;
        Task1 task1 = (Task1) o;
        return valueA == task1.valueA &&
                valueB == task1.valueB;
    }

    @Override
    public int hashCode() {

        return Objects.hash(valueA, valueB);
    }
}
