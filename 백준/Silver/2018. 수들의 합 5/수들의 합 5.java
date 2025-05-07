import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        if (N == 1 || N == 2) {
            System.out.println(1);
            return;
        }

        long cnt = 1;
        long sum = 0;

        for (long i = (N/2)+1; i > 0; i--) {
            sum = 0;
            for (long j = i; j > 0; j--) {
                sum += j;
                if (sum > N) break;
                else if (sum == N) {
                    cnt++;
                    break;
                }
            }
        }

        System.out.println(cnt);
    }
}