package regular_expressions;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

    private boolean testFind(String test){
        Pattern p = Pattern.compile(".+\\.(com|[Uu]a)");
        Matcher m = p.matcher(test);
        return m.matches();
    }

    private String testPartString(String test){
        Pattern p = Pattern.compile("(I).+(\\1)");
        Matcher m = p.matcher(test);
        if (m.find()) {
            return m.group();
        }
        return null;
    }

    private String testReplaceAll(String test){
        return test.replaceAll("([Tt]h?a[yi]land)", "Ukraine");
    }

    private boolean testValidInteger(int test){
        Pattern p = Pattern.compile("[1-5]");
        Matcher m = p.matcher(String.valueOf(test));
        return m.matches();
    }

    private boolean checkIfPhoneNumber(String number){
        Pattern p = Pattern.compile("(\\+*)\\d{10,12}");
        Matcher m = p.matcher(number);
        return m.matches();
    }

    private String [] splitString(String test){
        Pattern p = Pattern.compile("\\s*([,!.])\\s*");
        return p.split(test);
    }

    public static void main( String args[] ) {
        RegularExpressions reg = new RegularExpressions();
        System.out.println(reg.testFind("testFind.com ".trim()));
        System.out.println(reg.testFind("testFind.ua"));
        System.out.println(reg.testFind("testFind.Ua"));
        System.out.println(reg.testFind("testFind.ru"));
        System.out.println();
        System.out.println(reg.testReplaceAll("I like Thayland. thailand is city of my dreams. O my Tailand!"));
        System.out.println();
        System.out.println(reg.testValidInteger(4));
        System.out.println(reg.testValidInteger(6));
        System.out.println();
        System.out.println(reg.testPartString("Look at me, I am... I am very tall and same time I am small"));
        System.out.println();
        System.out.println(reg.checkIfPhoneNumber("+380671234567") ? "This number looks like a phone number" : "I can't understand what it is");
        System.out.println(reg.checkIfPhoneNumber("380671234567") ? "This number looks like a phone number" : "I can't understand what it is");
        System.out.println(reg.checkIfPhoneNumber("0671234567") ? "This number looks like a phone number" : "I can't understand what it is");
        System.out.println(reg.checkIfPhoneNumber("067123456") ? "This number looks like a phone number" : "I can't understand what it is");
        System.out.println();
        Arrays.asList(reg.splitString("Hello Java! Hello JavaScript! JavaSE 8.")).forEach(System.out::println);
    }
}
