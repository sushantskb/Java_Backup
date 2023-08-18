package sushant;
class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Raadius cannot be negative";
    }
    @Override
    public String getMessage(){
        return "Radius cannot be negative";
    }
}
public class Throw_Throws {
    public static double area(int r) throws NegativeRadiusException{
        if (r < 0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI*r*r*r;
        return result;
    }

    public static void main(String[] args) {
        try{
            double ar = area(-6);
            System.out.println(ar);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
