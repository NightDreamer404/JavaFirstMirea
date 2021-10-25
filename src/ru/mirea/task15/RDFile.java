package ru.mirea.task15;
import java.lang.*;
import java.io.*;
public class RDFile {
    public static void main(String[] args) {

        try (FileInputStream FINObj = new FileInputStream("D://test//msg.txt")) {
            int i;
            while ((i = FINObj.read()) != -1) {

                System.out.print((char) i);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
