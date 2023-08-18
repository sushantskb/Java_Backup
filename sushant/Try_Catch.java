package sushant;

public class Try_Catch {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        try{
            int c = a / b;
            System.out.println("The result of c is: " + c);
        }
        catch (Exception i){
            System.out.println("Sorry we have failed to execute");
            System.out.println(i);
        }
        System.out.println("End of Program");
    }
}
