import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.Comparator;

public class Demo {

    public static void main(String[] args) {



    Task1 task1=new Task1(1,2);
    Task1 task2=new Task1(2,3);
    Task1 task3=new Task1(4,5);
    Task1 task4=new Task1(6,7);

    TreeSet<Task1> list = new TreeSet<>();
        List<Task1> list2 = new ArrayList<>();
    list.add(task1);
    list.add(task3);
    list.add(task2);
    list.add(task4);
        list2.add(task1);
        list2.add(task3);
        list2.add(task2);
        list2.add(task4);
        List<Task1> list3 = new ArrayList<>();
        list3.add(task1);
        list3.add(task3);
        list3.add(task2);
        list3.add(task4);



        System.out.println(list);

        list2.sort(new ValueAComparator());
        list2.sort(Comparator.comparing(Task1::getValueB));
        System.out.println(list2);
        System.out.println(list3);
}
    }