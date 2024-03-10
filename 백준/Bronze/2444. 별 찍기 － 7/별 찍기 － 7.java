import java.util.Scanner;

public class Main {
    // 백준 2444
    // N이 주어지면 첫째 줄부터 2*N-1번째 줄까지 차례대로 별을 출력함
    // 별을 출력하는 규칙은 다음 예제와 같음
    //    *
    //   ***
    //  *****
    // *******
    //*********
    // *******
    //  *****
    //   ***
    //    *

    // 문제 풀이 전략
    // 첫째 줄 : 공백 4, 별 1
    // 둘째 줄 : 공백 3, 별 3
    // 셋째 줄 : 공백 2, 별 5
    // 넷째 줄 : 공백 1, 별 7
    // 다섯째 줄 : 공백 0, 별 9
    // 여섯째 줄 : 공백 1, 별 7
    // 일곱째 줄 : 공백 2, 별 5
    // 여덟째 줄 : 공백 3, 별 3
    // 아홉째 줄 : 공백 4, 별 1
    // 규칙
    // : 1~5번째 줄 -> 총 n줄, n-i개의 공백, 2*i-1개의 별
    //   6~9번째 줄 -> 총 n-1줄          ""
    // 이중 for문 2개 (첫째~다섯째 1개, 여섯째~아홉째 1개)
    // 그 안에 for문 2개 (공백 찍는 for문 1개, 별 찍는 for문 1개)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < N-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = N-1; i > 0 ; i--) {
            for (int j = 0; j < N-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
