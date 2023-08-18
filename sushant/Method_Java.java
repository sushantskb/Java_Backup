package sushant;

public class Method_Java {
  int logic(int x, int y){
        int z;
        if (x>y){
            z = x + y;
        }
        else {
            z = (x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a  = 5;
        int b = 7;
        int c;
        //First way to call a method;
//        c = logic(a,b);
//        System.out.println(c);

        //Second way to call a method is;
        //remove the static keyword and make an object in this public static;
        Method_Java obj = new Method_Java();
//        c = obj.logic(a, b);
        System.out.println(obj.logic(a, b));
        System.out.println();
        int a1 = 55;
        int b1 = 44;
        int c1 = obj.logic(a1, b1);
        System.out.println(c1);

    }
}
