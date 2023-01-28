package src.inputType.String;

import java.util.*;

public class StringTest{
    public String solution(String s){
        String tmp = new StringBuilder(s).reverse().toString();
        return (s.equalsIgnoreCase(tmp))? "YES" : "NO";
    }

    public static void main(String[] args) {
        StringTest T = new StringTest();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}