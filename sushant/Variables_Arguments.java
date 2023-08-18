package sushant;
public class Variables_Arguments {
    static int add(int ...arr){
        int result = 0;
        for(int a: arr){
            result = result + a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(add(2,3));
        System.out.println(add(1,4,6));
        System.out.println(add(2,77,88,999,123445));
    }
}
