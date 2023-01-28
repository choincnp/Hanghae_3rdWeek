package src.outputType.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.currentTimeMillis;

public class ArrayListTest {
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        return answer;
    }
    public static void main(String[] args) {
        ArrayListTest T = new ArrayListTest();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i=0; i< n; i++){
            str[i] = sc.next();
        }
        for (String x : T.solution(n,str)){
            System.out.println(x);
        }
    }
}

