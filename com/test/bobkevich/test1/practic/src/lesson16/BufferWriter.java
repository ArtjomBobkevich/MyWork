package lesson16;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class BufferWriter extends Thread{

    private List<Integer> list;

    public BufferWriter(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list){
            for (int i=1;i<100;i++){
                list.add(RandomValue.value());
            }
                Path writePath = Paths.get("create project", "log.txt");
                try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(writePath.toFile()))) {
                    String value = list.toString();
                    bufferedWriter.write(value);
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}
