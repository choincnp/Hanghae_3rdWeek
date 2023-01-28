package src.inputType.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class StringArrayTest {
    public String solution(String[] arr, String[] arr2){
        String answer = "";
        return answer;
    }

    public static void main(String[] args) {
        StringArrayTest T = new StringArrayTest();
        Scanner sc = new Scanner(System.in);
        String array1 = sc.nextLine();
        String array2 = sc.nextLine();
        array1 = array1.replaceAll("[\\[\\[\\]]","");
        array2 = array2.replaceAll("[\\[\\[\\]]","");
        String[] stArr1 = array1.trim().split("\\s*,\\s*");
        String[] stArr2 = array2.trim().split("\\s*,\\s*");
        System.out.println(stArr1);
        System.out.println(Arrays.toString(stArr2));
        System.out.println(T.solution(stArr1,stArr2));
    }
}
