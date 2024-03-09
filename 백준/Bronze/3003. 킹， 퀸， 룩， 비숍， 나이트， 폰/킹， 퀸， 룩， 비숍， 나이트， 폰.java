import java.util.Scanner;

public class Main {
    // 백준 3003
    // 체스 말 중 흰색 피스의 개수가 완전하지 않다.
    // 각각 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
    // 발견한 흰색 피스의 개수를 보고, 몇 개를 더하거나 빼야지 완전한 세트가 되는지 구하는 문제이다.
    // 입력에서 주어진 순서대로 몇 개를 더하고 빼야하는지 출력한다.(양수면 더하고 음수면 뺀다)

    // 문제 풀이 전략
    // 1. 완전한 세트 개수를 배열로 저장한다.
    // 2. 찾은 피스 수를 배열로 저장한다.
    // 3. 두 배열에서 같은 인덱스에 저장된 데이터끼리 빼준다(완전 세트 수 - 찾은 피수 수).
    // 4. for문으로 하나씩 출력해준다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] set = {1, 1, 2, 2, 2, 8}; // 체스말 별 완전한 세트 수
        int[] findPeace = new int[6]; // 체스말 별 찾은 피스 수

        for (int i = 0; i < findPeace.length; i++) {
            findPeace[i] = sc.nextInt(); // 몇개 찾았는지 데이터 받기
        }

        for (int i = 0; i < findPeace.length; i++) {
            int amount = set[i] - findPeace[i]; // 완벽한 세트를 위한 총 개수
            if (i == findPeace.length-1) {
                System.out.print(amount);
            }
            else {
                System.out.print(amount + " ");
            }
        }
    }
}
