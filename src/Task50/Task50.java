package Task50;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Task50 {
    public static void main(String[] args) throws IOException {

        int[] numbers = {1, 2, 3, 4, 5};
        ArrayList<File> list = new ArrayList<>();
        File file = new File("d:/1/2/3");
        File newFileName = new File(file + "/allFiles.txt");

        while (file.mkdirs()) {
            System.out.println("Создалась цепочка папок");
        }
        for (int item : numbers) {
            String key = "file" + item;
            File file1 = File.createTempFile(key, ".txt", file);

            Writer writer = new OutputStreamWriter(new FileOutputStream(file1));
            writer.write(randomNum());
            writer.close();


        }
        System.out.println("Cоздались 5 тектовых файлов");
        System.out.println("В текстовые файлы записали 10 произвольных чисел");


        BufferedWriter writer = new BufferedWriter(new FileWriter(newFileName));
        for (File files : searchFiles(file, list)) {
            BufferedReader reader = new BufferedReader(new FileReader(files));
            while (reader.ready()) {
                writer.write(reader.readLine());
            }
            writer.newLine();
            reader.close();
        }
        writer.close();
        System.out.println("Записались данные файлов в новый файл");

        extracted(file);
        System.out.println();


    }

    private static void extracted(File folder) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(folder + "/finishFiles.txt"))) {
            String[] pathsFilesAndDir = folder.list();
            writer.write(Arrays.toString(pathsFilesAndDir));
            writer.close();
            System.out.println("Создался окончательный файл со списком всех файлов в папке");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static String randomNum() {
        int[] array;
        array = new int[10];
        for (int i = 0; i < array.length; ++i) {
            array[i] = (int) (Math.random() * 10 + 1);
        }
        return Arrays.toString(array);
    }

    static public ArrayList<File> searchFiles(File folder, ArrayList<File> list) {
        File[] folderEntries = folder.listFiles();
        assert folderEntries != null;
        for (File entry : folderEntries) {
            if (entry.isDirectory()) {
                searchFiles(entry, list);
            } else {
                list.add(entry);
            }
        }

        return list;
    }

}



