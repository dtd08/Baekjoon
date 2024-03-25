import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 행에 없으면 하나 무조건 추가
        // 인덱스로 열에 있는지 파악
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 세로
        int M = sc.nextInt(); // 가로 (X 최소 존재 개수)
        String[] map = new String[N];
        int row = 0;
        int col = 0;

        for(int i=0; i < N; i++) { // 초기화 및 행 판별
            map[i] = sc.next();
            if(!map[i].contains("X")) row++;
        }

        for(int i=0; i < M; i++) { // 열 판별
            if(map[0].charAt(i) != 'X') {
                col++;
                for(int j=0; j < N; j++) {
                    if(map[j].charAt(i) == 'X') {
                        col--;
                        break;
                    }
                }
            }
        }

        System.out.println(Math.max(row, col));
    }
}