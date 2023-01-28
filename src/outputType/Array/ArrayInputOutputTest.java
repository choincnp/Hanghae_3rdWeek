package src.outputType.Array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class ArrayInputOutputTest {
    public int[] solution(int[] arr, int divisor){
        int[] answer = new int[0];
        return answer;
    }

    public static void main(String[] args) {
        ArrayInputOutputTest T = new ArrayInputOutputTest();
        Scanner sc = new Scanner(System.in);
        String array = sc.nextLine();
        array = array.replaceAll("[\\[\\[\\]]","");
        String[] stArr = array.split(",");
        int[] arr = Stream.of(stArr).mapToInt(Integer::parseInt).toArray();
        int tmp = sc.nextInt();
        System.out.println(Arrays.toString(T.solution(arr,tmp)));
    }
}
