package sushant;
public class Practice_Set_3 {
    public static void main(String[] args) {
        System.out.println("Practice Set 3");
        //Converting a string to lower case
//        String name = "Ruturaj Maharana";
//        name = name.toLowerCase();
//        System.out.println(name);

        //Replacing the spaces with underscores
//        String name = "Sushant    Kumar Bishoi";
//        name = name.replace(" ", "_");
//        System.out.println(name);

        //Making a template
        String txt = "Dear <name>! thanks a lot";
        txt = txt.replace("<name>", "Sushant");
        System.out.println(txt);

        //To detect double or triple spaces in the string
        String det = "this string contains  double or triple   spaces";
        System.out.println(det.indexOf("  "));
        System.out.println(det.indexOf("   "));

        //Formatting the given string using the escape sequence
        String format = "Dear Sushant, \nThis is a java program";
        System.out.println(format);




    }
}
