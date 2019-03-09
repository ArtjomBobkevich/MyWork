package last.homework;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class NameOfActivity {
    private List<String> listAllActivity;
    private List<String> listAllActivityWithoutEnd;

    public void addAtListActivity (String string){
        this.listAllActivity.add(string);
    }

    public void addAtListActivityWithoutEnd (String string){
        if (!string.equals("Конец")) {
            this.listAllActivityWithoutEnd.add(string);
        }
    }

    @Override
    public String toString() {
        return this.listAllActivity.toString();
    }
}