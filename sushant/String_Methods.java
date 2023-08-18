package sushant;
public class String_Methods {
    public static void main(String[] args) {
        String name = "Sushant";
         System.out.println(name);
        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);
//
        String ustring = name.toUpperCase();
        System.out.println(ustring);
//
        String nonTrimmedString = "     Sushant     ";
//        System.out.println(nonTrimmedString);
//
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);
//
        System.out.println(name.substring(1));
        System.out.println(name.substring(1,5));
//
        System.out.println(name.replace('s', 'p'));
        System.out.println(name.replace("h", "L"));
//
        System.out.println(name.startsWith("Su"));
        System.out.println(name.endsWith("nt"));
//
        System.out.println(name.charAt(4));

        String modifiedName = "Sussshhhannt";
        System.out.println(modifiedName.indexOf("sss"));
        System.out.println(modifiedName.indexOf("sss", 4));
        System.out.println(modifiedName.lastIndexOf("sss", 7));

        System.out.println(name.equals("Sushant"));
        System.out.println(name.equalsIgnoreCase("SusHant"));

        System.out.println("I am escape sequence\tdouble quote");
    }
}
