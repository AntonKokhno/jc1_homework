package Task46;

import java.io.File;
import java.io.IOException;

public class Task46 {
    public static void main(String[] args) {
        File currentDir = new File("d:/AntonKokhno");
        displayAllFilesDirectories(currentDir);

    }


    public static void displayAllFilesDirectories(File dir) {
        try {
            File[] files = dir.listFiles();
            assert files != null;
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println("Каталог: " + file.getCanonicalPath());
                }
                else {
                    System.out.println("     Файл: " + file.getCanonicalPath() );
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}