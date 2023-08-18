package sushant;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class File_Handeling {
    public static void main(String[] args) {
        File myFile = new File("Myfile.txt");
        try{
            myFile.createNewFile();
            System.out.println("Succesfully created");
        }
        catch (IOException e){
            e.printStackTrace();
        }
        //Writing the file
        try{
            FileWriter fileWriter = new FileWriter("Myfile.txt");
            fileWriter.write("this is my first attempt");
            System.out.println("Successfully written");
        }
        catch (IOException e){
            e.printStackTrace();
        }
        //Reading the file
        try{
            Scanner sc = new Scanner(myFile);
            if (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        //Deleting a file
        if (myFile.delete()){
            System.out.println("Deleted Succesfully" + myFile.getName());
        }
        else{
            System.out.println("Some problem occurs");
        }
    }
}
