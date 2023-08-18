package sushant;
class Phone{
    public void showTime(){
        System.out.println("Time is 8 am....");
    }
    public void on(){
        System.out.println("Turning on Phone....");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music....");
    }
    public void on(){
        System.out.println("Turning on the smartphone....");
    }
}
public class Dynamic_Dispatch {
    public static void main(String[] args) {
        System.out.println("Dynamic Dispatch");
        Phone obj = new Phone();
        SmartPhone Sobj = new SmartPhone();
//        obj.name(); //not allowed
        obj.showTime();
        obj.on();
        Sobj.music();
        Sobj.on();

//        obj.music()  //not allowed

        Sobj.showTime();

        Phone ob1 = new SmartPhone();
        ob1.on();


        //Refer to the website during the time of revision also advised to rematch the video......
    }
}
