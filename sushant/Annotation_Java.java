package sushant;
@FunctionalInterface
interface MyFuncInter{
    void thisMethod();
    //Try adding another method...
}
class MyPhone{
    @Deprecated
    int sum(int a, int b){
        return a+b;
    }
    void display(){
        System.out.println("Displaying");
    }
}
class MyNewPhone extends MyPhone{
    @Override
    public void display(){
        System.out.println("Overriding");
    }
}
public class Annotation_Java {
    @SuppressWarnings("deprecation") //Just uncomment it to use the deprecated method
    public static void main(String[] args) {
        MyNewPhone ph = new MyNewPhone();
        int s = ph.sum(5,6);
        System.out.println(s);
        ph.display();

    }
}
