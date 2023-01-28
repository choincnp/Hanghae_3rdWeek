package src.outputType.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutputTest {
    public long[] solution(int a, int b){
        long[] answer = new long[a];
        return answer;
    }

    public static void main(String[] args) {
        ArrayOutputTest T = new ArrayOutputTest();
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        System.out.println(Arrays.toString(T.solution(i1,i2)));
    }
}
