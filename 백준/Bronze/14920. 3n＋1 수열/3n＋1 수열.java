import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        int cnt = 1;

        while(c != 1) {
            if (c % 2 == 0) c /= 2;
            else c = c * 3 + 1;
            cnt++;
        }
        System.out.println(cnt);
    }
}