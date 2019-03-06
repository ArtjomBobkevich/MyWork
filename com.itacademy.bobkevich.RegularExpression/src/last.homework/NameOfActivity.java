package last.homework;

import java.util.LinkedList;
import java.util.List;

public class NameOfActivity {
    private List<String> listAllActivity= new LinkedList<>();

    public NameOfActivity() {
    }

    public void addAtListActivity (String string){
        this.listAllActivity.add(string);
    }

    public List<String> getListAllActivity() {
        return this.listAllActivity;
    }

    @Override
    public String toString() {
        return this.listAllActivity.toString();
    }
}