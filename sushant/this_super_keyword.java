package sushant;
class One_class{
    int a;

    public int getA() {
        return a;
    }
    One_class(int a){
        this.a = a;
        System.out.println("The value of a is " + a); //can uncomment this line to observe what happens next
    }

}
class Sec_Class extends One_class{
    Sec_Class(int c)
    {
        super(c);
        System.out.println("The value of c is " + c);
    }
}
public class this_super_keyword {
    public static void main(String[] args) {
        One_class o = new One_class(65);
//        System.out.println("The value of a is " + o.getA());
        Sec_Class s = new Sec_Class(26);
    }
}
