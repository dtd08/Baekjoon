import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int num = sc.nextInt() + sc.nextInt();
            System.out.println("Case " + (i+1) + ": " + (num));
        }
    }
}
