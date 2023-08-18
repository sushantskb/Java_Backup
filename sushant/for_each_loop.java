package sushant;
public class for_each_loop {
    public static void main(String[] args) {
        System.out.println("Printing array using normal for loop");
        int marks[] = {98,85,12,14,96,78};
        //Displaying the array
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        System.out.println("Printing the array using for-each loop");

        //Displaying the array
        for(int element: marks){
            System.out.println(element);
        }

        System.out.println("Printing the array in reverse order");

        //Displaying the array
        for (int i = marks.length - 1; i >= 0 ; i--) {
            System.out.println(marks[i]);
        }
    }
}
