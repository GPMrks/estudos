import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String name = "    GPMrks   ";

        //boolean result = name.equalsIgnoreCase("gpmrks");
        //int result = name.length();
        //char result = name.charAt(0);
        //int result  = name.indexOf('M');
        //boolean result = name.isEmpty();
        //String result = name.toUpperCase();
        //tring result = name.toLowerCase();
        //String result = name.trim();

        String result = name.replace('G', 'P');

        System.out.println(result.trim());

    }

}
