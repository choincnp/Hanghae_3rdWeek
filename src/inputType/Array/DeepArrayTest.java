package src.inputType.Array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class DeepArrayTest {
    public int[][] solution(int[][] arr1, int[][] arr2){
        int[][] answer = new int[0][0];
        return answer;
    }

    public static void main(String[] args) {
        DeepArrayTest T = new DeepArrayTest();
        Scanner sc = new Scanner(System.in);
        String array1 = sc.nextLine().trim();
        String array2 = sc.nextLine().trim();
        array1 = array1.substring(1,array1.length()-1);
        array2 = array2.substring(1,array2.length()-1);
        String[] stArr1 = array1.split("(?<=\\]),\\s?(?=\\[)");
        String[] stArr2 = array2.split("(?<=\\]),\\s?(?=\\[)");
        int[][] arr1 = new int[stArr1.length][];
        int[][] arr2 = new int[stArr2.length][];
        stArrToIntArr(stArr1, arr1);
        stArrToIntArr(stArr2, arr2);
        System.out.println(Arrays.deepToString(T.solution(arr1,arr2)));
    }
    public static void stArrToIntArr(String[] stArr2, int[][] arr2) {
        for (int i=0;i<stArr2.length;i++){
            stArr2[i] = stArr2[i].replaceAll("[\\[\\[\\]]","");
            String[] strArr2 = stArr2[i].split(",");
            arr2[i] = Stream.of(strArr2).mapToInt(Integer::parseInt).toArray();
        }
    }
}
