import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            T -= sc.nextInt();
        }

        System.out.println((T > 0) ? "Padaeng_i Cry": "Padaeng_i Happy");
    }
}