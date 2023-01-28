package src.inputType.Array;

import java.util.Scanner;
import java.util.stream.Stream;

//1. run시 입력받을 array의 length을 입력하고 엔터
//2. [1,2,3] 같은경우 1 2 3 으로 쓸 것
public class IntArrayTest {
    public int solution(int[] arr){
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        IntArrayTest T = new IntArrayTest();
        Scanner sc = new Scanner(System.in);
        String array = sc.nextLine();
        array = array.replaceAll("[\\[\\[\\]]","");
        String[] stArr = array.split(",");
        int[] arr = Stream.of(stArr).mapToInt(Integer::parseInt).toArray();
        System.out.println(T.solution(arr));
    }
}