package Day_1;

import java.util.Scanner;

/*
문제 설명
문자열 str과 정수 n이 주어집니다.
str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.

제한사항
1 ≤ str의 길이 ≤ 10
1 ≤ n ≤ 5

입출력 예
입력 #1
string 5

출력 #1
stringstringstringstringstring
 */
public class D1_03 {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            System.out.print(str);
        }
    }
}
