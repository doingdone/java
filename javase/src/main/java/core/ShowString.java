package core;

/**
 * Created by zwd on 2017/10/26.
 */
public class ShowString {

    public static void main(String[] args) {
        String str = "hello";

        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        char[] chars = str.toCharArray();


    }
}
