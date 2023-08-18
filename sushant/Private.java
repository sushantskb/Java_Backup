package sushant;
class employee{
    private int id;
    private String name;
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return  id;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}

public class Private {
    public static void main(String[] args) {
        employee e1 = new employee();
        e1.setName("Sushant");
        System.out.println(e1.getName());
        e1.setId(427);
        System.out.println(e1.getId());
    }
}
