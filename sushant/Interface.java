package sushant;
interface MyCamera{
    void takeSnap();
    void recordVideo();
}
interface MyWifi{
    String [] getNetworks();
    void connectToNetwork(String Network);
}
class MyCellPhone{
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);

    }
    void pickCall(){
            System.out.println("Connecting....");
    }
}
class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
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

    @Override
    public void connectToNetwork(String Network) {
        System.out.println("Connecting " + Network);
    }
}

public class Interface {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.takeSnap();
        ms.recordVideo();
        String [] ar = ms.getNetworks();
        for (String item : ar){
            System.out.println(item);
        }
        ms.connectToNetwork("Jio");
        ms.callNumber(700849111);
        ms.pickCall();
    }
}
