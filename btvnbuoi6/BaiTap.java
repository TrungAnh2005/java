package btvnbuoi6;

import java.lang.reflect.Parameter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BaiTap {
    public static void main(String[] args) {
//        Bai 2
        System.out.println(bai2("phkui"));
        System.out.println(bai2("pq"));
        System.out.println(bai2("padafasfq"));
//        Bai 3
        System.out.println(bai3("abc_def"));
        System.out.println(bai3("Abc_def"));
//        Bai 4
        System.out.println(bai4("fhajfaha"));
        System.out.println(bai4("Ab_Cd_12"));
        System.out.println(bai4("Ab_Cd_12.0"));
//        Bai 5
        System.out.println(bai5("54321"));
        System.out.println(bai5("654321"));
    }
    public static String bai2(String text){
        if (text.matches("p.*?q$"))
            return "Phu hop";
        else
            return "Khong phu hop";
    }
    public static String bai3(String text){
        if (text.matches("^[a-z]+_[a-z]+$"))
            return "Phu hop";
        else
            return "Khong phu hop";
    }
    public static String bai4(String text){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_]*$");
        Matcher m =pattern.matcher(text);
        if (m.find())
            return "Phu hop";
        else
            return "Khong phu hop";
    }
    public static String bai5(String text){
        Pattern pattern = Pattern.compile("^5.*$");
        Matcher m = pattern.matcher(text);
        if (m.find())
            return "Phu hop";
        else
            return "Khong phu hop";
    }
}
