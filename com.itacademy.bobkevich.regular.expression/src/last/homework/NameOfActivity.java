package last.homework;

import java.util.LinkedList;
import java.util.List;

public class NameOfActivity {
    private List<String> listAllActivity= new LinkedList<>();
    private List<String> listAllActivityWithoutEnd= new LinkedList<>();

    public NameOfActivity() {
    }

    public void addAtListActivity (String string){
        this.listAllActivity.add(string);
    }

    public void addAtListActivityWithoutEnd (String string){
        if (!string.equals("Конец")) {
            this.listAllActivityWithoutEnd.add(string);
        }
    }

    public List<String> getListAllActivity() {
        return this.listAllActivity;
    }

    public List<String> getListAllActivityWithoutEnd() {
        return listAllActivityWithoutEnd;
    }

    @Override
    public String toString() {
        return this.listAllActivity.toString();
    }
}