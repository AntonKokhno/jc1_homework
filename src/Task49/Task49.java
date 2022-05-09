package Task49;

import java.io.*;

public class Task49 {
    public static void main(String[] args) {

        File fileOutPut = new File("d:/AntonKokhno/fileOutPut.txt");
        byte[] mass = new byte[20];
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileOutPut);
            FileInputStream fileInputStream = new FileInputStream(fileOutPut);
            for (int i = 0; i < mass.length; i++) {
                double random = Math.random() * 10 + 1;
                byte b = (byte) random;
                mass[i] = b;
            }
            fileOutputStream.write(mass, 0, mass.length);
            byte[] massFinish = new byte[20];
            fileInputStream.read(massFinish, 0, massFinish.length);
            double number = 0;
            for (byte finish : massFinish) {
                System.out.println(finish);
                number += finish;
            }
            System.out.println(" ");
            System.out.println("Среднеее арифметическое: "+number / massFinish.length);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}


