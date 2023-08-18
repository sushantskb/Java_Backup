package sushant;
class A{
    int a;
    int harry(){
        return 4;
    }
    void meth2(){
        System.out.println("This the method of class A");
    }
}
class B extends A{
    @Override
    void meth2() {
        System.out.println("This is the method2 of class A");
    }
    void meth3(){
        System.out.println("I am the method of class B");
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
        System.out.println("This is the program for method overriding");
        A a = new A();
        System.out.println("This is the return statement from class A:" + " " + a.harry());
        a.meth2();

        System.out.println();

        B b = new B();
        System.out.println("This is the return statement from class B:" + " " + b.harry());
        b.meth2();
        b.meth3();
    }
}
