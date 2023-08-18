package sushant;
import java.util.Random;
import java.util.Scanner;

class Game{
    int number;
    int inputNumber;
    int noOfgusses = 0;

    public int getnoOfgusses() {
        return noOfgusses;
    }

    public void setnoOfgusses(int noOfgusses) {
        this.noOfgusses = noOfgusses;
    }
    Game(){
        Random rn = new Random();
        this.number = rn.nextInt(100);
    }
    void takeInput(){
        Scanner input = new Scanner(System.in);
        System.out.print("Guess a number:");
        inputNumber = input.nextInt();
    }
    boolean isCorrectNumber(){
        noOfgusses++;
        if (inputNumber==number)
        {
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfgusses);
            return true;
        }
        else if(inputNumber<number)
        {
            System.out.println("Too low...");
        }
        else if(inputNumber>number){
            System.out.println("Too high...");
        }
        return false;
    }

}
public class Exercise_3 {
    public static void main(String[] args) {
        System.out.println("Guess the number...");
        Game g = new Game();
        boolean b = false;
        while (!b){
            g.takeInput();
            b = g.isCorrectNumber();
        }
    }
}
