package src.inputType.Array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

class DoubleArrayTest {
    public int solution(int[] intArr, Boolean[] booleanArr){
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        DoubleArrayTest T = new DoubleArrayTest();
        Scanner sc = new Scanner(System.in);
        String array1 = sc.nextLine();
        String array2 = sc.nextLine();
        array1 = array1.replaceAll("[\\[\\[\\]]","");
        array2 = array2.replaceAll("[\\[\\[\\]]","");
        String[] stArr = array1.split(",");
        String[] tmpArr = array2.split(",");
        Boolean[] booleanArr = new Boolean[tmpArr.length];
        System.out.println(Arrays.toString(tmpArr));
        for (int i=0; i< tmpArr.length;i++)
            booleanArr[i] = Boolean.parseBoolean(tmpArr[i]);
        int[] intArr = Stream.of(stArr).mapToInt(Integer::parseInt).toArray();
        System.out.println(T.solution(intArr,booleanArr));
    }
}
