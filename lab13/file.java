package lab13;

import java.io.*;
import java.util.Scanner;

public class file {
    public static void main(String[] args) {
       //Задание 1 и 3
        try (FileWriter writer = new FileWriter("C:\\Users\\egor0\\OneDrive\\Рабочий стол\\java_labs_mirea\\lab13\\test.txt", false)){
            Scanner s = new Scanner(System.in);
            String w = s.nextLine();
            writer.write(w);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        //Задание 2
        try (FileReader reader = new FileReader("C:\\Users\\egor0\\OneDrive\\Рабочий стол\\java_labs_mirea\\lab13\\test.txt")){
            int c;
            while ((c=reader.read())!=-1){
                System.out.println((char)c);
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        //Задание 4
        try (FileWriter writer = new FileWriter("C:\\Users\\egor0\\OneDrive\\Рабочий стол\\java_labs_mirea\\lab13\\test.txt", true)){
            Scanner s = new Scanner(System.in);
            String w = s.nextLine();
            writer.append("\n");
            writer.write(w);
            writer.flush();
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        
    }
}