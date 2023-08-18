package calc;
class calculator{
    public int calc(int a, int b){
        return a + b;
    }
}
class sc_calc{
    public double sc(int a, int b){
        return Math.sin(a+b);
    }
}
class mycalc{
    public void my(int a, int b){
        System.out.println(a+b);
        System.out.println(Math.sin(a+b));
    }
}
public class Practice_set_12 {
    public static void main(String[] args) {
        System.out.println("I am a method");
        calculator c = new calculator();
        System.out.println(c.calc(78, 78));
        sc_calc sc = new sc_calc();
        System.out.println(sc.sc(1,1));
        mycalc my = new mycalc();
        my.my(7,8);

    }
}