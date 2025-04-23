import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] N = new int[n];
        int sumN = 0;

        for (int i = 0; i < n; i++) {
            N[i] = sc.nextInt();
            sumN += N[i];
        }

        int[] Q = new int[sumN];
        int pre = 0;
        int time = 0;

        for (int Ti = 0; Ti < n; Ti++) {
            for (time = pre; time < pre+N[Ti]; time++) {
                Q[time] = Ti +1;
            }

            pre += N[Ti];
        }

        for (int i = 0; i < q; i++) {
            int idx = sc.nextInt();
            System.out.println(Q[idx]);
        }
    }
}
