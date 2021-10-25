package ru.mirea.task15;
import java.lang.*;
import java.util.Scanner;
import java.io.*;
public class RWFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        File file = new File("D://test//msg.txt");
        String text = scan.nextLine(); // строка для записи
        try(FileOutputStream FOSObj = new FileOutputStream(file, false))
        {
            // перевод строки в байты
            byte[] buf = text.getBytes();

            FOSObj.write(buf);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        System.out.println("The file has been re-written");
    }
}
