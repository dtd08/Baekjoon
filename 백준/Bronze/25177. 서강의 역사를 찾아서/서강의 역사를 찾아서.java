import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int bigger = Math.max(N, M);
        int max = 0;

        int[] a = new int[bigger];
        int[] b = new int[bigger];

        for (int i = 0; i < N; i++) a[i] = sc.nextInt();
        for (int i = 0; i < M; i++) b[i] = sc.nextInt();

        // 제일 점수가 높았던 건물 X, 증가량이 높은 건물 O
        for (int i = 0; i < M; i++) max = Math.max(max, (b[i]-a[i]));

        System.out.println(max);
    }
}
