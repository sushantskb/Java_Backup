package sushant;
class Student{
    private int id;
    private String name;
    public void setId(int i){
        id =i;
    }
    public void setName(String n){
        name = n;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

}
public class Acess_Modifiers {
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(427);
        System.out.println("The roll number is: " + s.getId());
        s.setName("Sushant");
        System.out.println("The name of the student is: " + s.getName());
    }
}
