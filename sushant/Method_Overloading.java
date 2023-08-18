package sushant;
public class Method_Overloading {
    static void foo(){
        System.out.println("Good Morning Bro");
    }
    static void foo(int a){
        System.out.println("Good morning " + a + " bro!");
    }
    static void foo(int a, int b){
        System.out.println("Good morning " + " bro!");
    }
    static void foo(int a, int b, int c){
        System.out.println("Good morning bro " + a + " how are you doing");
        System.out.println("Good morning " + b + " how are you doing bro!");
    }
    static void change(int a){
        a = 98;
    }
    static void change(int arr[]){
        arr[0] = 98;
    }
    public static void main(String[] args) {
        //Case 1:
        int x = 45;
        change(x);
        System.out.println("The change after running the code is " + x);

        //Case 2:
        int [] marks = {1,4,3,54,45};
        change(marks);
        System.out.println("The change after running the code is " + marks[0]);

        //Case 3:
        foo();
        foo(300);
        foo(500,600);
        foo(5,3,6);
    }
}
