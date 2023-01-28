package src.inputType.Int;

import java.util.Scanner;

public class IntTest {
    public int solution(int n){
        int answer=0;
        return answer;
    }
    public static void main(String[] args) {
        IntTest T = new IntTest();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
//        int b = sc.nextInt(); // 인자를 두 개 받고 싶은 경우 주석 해제하고 T.solution(a,b)로 변경
        System.out.println(T.solution(a));
    }
}
