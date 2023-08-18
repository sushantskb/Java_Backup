package sushant;
interface Icon{
    //Anonymous
//    void meth1();
    void meth1(int a);
}
public class Anonymous_Lambda {
    public static void main(String[] args) {
        //Normally when we have to implement a interface so, usually we make a class and implement it there, but Anonymous Class helps us to do it easily provided if we have to use the assign method only for once....

        //Anonymous Class
//        Icon i = new Icon() {
//            @Override
//            public void meth1() {
//                System.out.println("I am a method");
//            }
//        };
//        i.meth1();

        //Lambda
        Icon i1 = (a)->{
            System.out.println("I am a method 1 is " + a);
        };
        i1.meth1(6);
    }
}
