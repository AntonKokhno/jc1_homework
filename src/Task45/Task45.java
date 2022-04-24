package Task45;

import java.io.File;
import java.io.IOException;


public class Task45 {


    public void createFile() throws IOException {
        File file = new File(" ");
        file.createNewFile();
    }


    public static void main(String[] args) {
        Task45 task45 = new Task45();
        try {
            task45.createFile();
        } catch (IOException e) {
            System.out.println("не корректный путь к файлу");
        }


    }


}
