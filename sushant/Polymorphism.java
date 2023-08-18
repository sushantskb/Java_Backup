package sushant;
interface MyCamera2{
    void takeSnap();
    void recordVideo();
}
interface MyWifi2{
    String [] getNetworks();
    void connectToNetwork(String Network);
}
class MyCellPhone2{
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);

    }
    void pickCall(){

        System.out.println("Connecting....");
    }
}
class MySmartPhone2 extends MyCellPhone2 implements MyWifi2, MyCamera2{

    public void takeSnap(){

        System.out.println("Taking Snap...");
    }
    public void recordVideo(){

        System.out.println("Recording Video...");
    }
    public String [] getNetworks() {
        System.out.println("Getting List of Networks");
        String [] netWorkList = {"Sushant", "Vivek", "Sridhar"};
        return netWorkList;
    }

    
    public void connectToNetwork(String Network) {
        System.out.println("Connecting " + Network);
    }
    public void sampleMeth(){
        System.out.println("Method");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam = new MySmartPhone2(); //This is a smartphone but, use it as a camera
//    cam.getNetworks(); //-->Not allowed
//    cam.sampleMeth(); // -->Not allowed

        cam.takeSnap();
        cam.recordVideo();

        System.out.println();

        MySmartPhone2 s = new MySmartPhone2();
        s.sampleMeth();
        s.recordVideo();
        s.getNetworks();
        s.callNumber(95556);
        s.connectToNetwork("Jio");
        s.pickCall();
    }


}
