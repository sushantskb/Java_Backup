package sushant;
class Employee{
    int id;
    int salary;
    String name;
    void printDetails(){
        System.out.println("My id is " + id + " and name is " + name + " with salary " + salary);  //Here "public" is optional it depends on us whether we want to use it or not.
        //And in case of getsalary() I am directly printing the value of salary
    }
}
 class Custom_Class {
    public static void main(String[] args) {
        System.out.println("Creating our custom class");
        Employee Sushant = new Employee();
        //Setting the attributes
        Sushant.id = 427;
        Sushant.name = "Sushant";
        Sushant.salary = 7893546;

        //Printing the value
        Sushant.printDetails();

        System.out.println();

        System.out.println("Thank You");


    }
}
