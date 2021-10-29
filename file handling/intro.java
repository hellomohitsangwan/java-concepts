import java.io.*;
import java.util.Scanner;

public class intro{
    public static void main(String[] args) {
        // File myFile = new File("testt.txt");
        // try {
        //     //creating the file
        //     myFile.createNewFile();
        // } catch (Exception e) {
        //     System.out.println(e);
        //     e.printStackTrace();
        // }
        // //writing in a file
        // try {
        // FileWriter fw = new FileWriter("testt.txt");
        // fw.write("this is the frts line");
        // fw.close(); }
        // catch(IOException e) {
        //     System.out.println(e);
        // }

        //reading a file
        File myFile = new File("testt.txt");

        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("error");
            e.printStackTrace();
            //TODO: handle exception
        }
    }
}