package sushant;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class ques_1{
    @Deprecated
    int sum(int a, int b){
        return a+b;
    }
}
interface ques3{
    public void display();
}
public class Practice_set_15 {

    public static <ques_3> void main(String[] args) throws IOException {
//        Question 1: Create a class and a method with deprecated annotation. What is its effect on program execution?
//        ques_1 q = new ques_1();
//        int a = q.sum(7, 9);
//        System.out.println(a);


//        Question 2: Suppress the warning generated in question number 2
//        @SuppressWarnings(value = "Deprecated")
//        ques_1 q = new ques_1();
//        System.out.println(q.sum(2, 6));

//        Question 3: Create an interface and generate an instance from it.
//        ques3 q = new ques3(){
//          public void display(){
//              System.out.println("I am a instance");
//          }
//        };
//        q.display();

//        Question 4: Write a Java program to generate a multiplication table of a given number and write it to a file.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
        String res = "";
        int a = 2;
        for (int i = 1; i < 11; i++) {
            res = res + a + " x " + i + " = " + a * i;
            res = res + "\n";
        }
        File myFile = new File("Table.txt");
        try {
            myFile.createNewFile();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
      try{
        FileWriter f = new FileWriter("Table.txt");
        f.write(res);
        f.close();
      }
      catch (RuntimeException e){
          throw new RuntimeException(e);
      }

    }
}
