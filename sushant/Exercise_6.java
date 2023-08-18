package sushant;
class Invalid_input extends Exception{
    public String toString(){
        return "Invalid input";
    }
    public String getMessage(){
        return "Message";
    }
}
class Cannot_Divide_Zero extends Exception{
    public String toString(){
        return "Cannot Divide by Zero";
    }
    public String getMessage(){
        return "Message";
    }
}
class Max_input extends Exception{
    public String toString(){
        return "Maximum input exceeded";
    }
    public String getMessage(){
        return "Message";
    }
}
class Max_Multiplier extends Exception{
    public String toString(){
        return "Maximum multiplier reached";
    }
    public String getMessage(){
        return "Message";
    }
}
class Custom_Calculator{
    double add(double a, double b) throws Invalid_input, Max_input{
        if(a>100000 || b>100000){
            throw new Max_input();
        }
        if (a == 8 || b == 9){
            throw new Invalid_input();
        }
        else {
            return a + b;
        }
    }
    double sub(double a, double b) throws Invalid_input, Max_input{
        if(a>100000 || b>100000){
            throw new Max_input();
        }
        if (a == 8 || b == 9){
            throw new Invalid_input();
        }
        else {
            return a - b;
        }
    }
    double mult(double a, double b) throws Invalid_input, Max_input, Max_Multiplier{
        if(a>100000 || b>100000){
            throw new Max_input();
        }
        if (a == 8 || b == 9){
            throw new Invalid_input();
        }
        if (a > 100000 || b>100000){
            throw new Max_Multiplier();
        }
        else {
            return a * b;
        }
    }
    double div(double a, double b) throws Invalid_input, Max_input, Cannot_Divide_Zero{
        if(a>100000 || b>100000){
            throw new Max_input();
        }
        if (a == 8 || b == 9){
            throw new Invalid_input();
        }
        if (b == 0){
            throw new Cannot_Divide_Zero();
        }
        else {
            return a / b;
        }
    }
}
public class Exercise_6 {
    public static void main(String[] args) {
//        Exercise 6: You have to create a custom calculator with following operations:
//        1. + -> Addition
//        2. - -> Subtraction
//        3. * -> Multiplication
//        4. / -> Division
//        which throws the following exceptions:
//        1. Invalid input Exception ex: 8 & 9
//        2. Cannot divide by 0 Exception
//        3. Max Input Exception if any of the inputs is greater than 100000
//        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
        Custom_Calculator c = new Custom_Calculator();
        try{
            c.add(8, 9);
            c.sub(23, 23);
            c.mult(23, 23);
            c.div(23, 0);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
