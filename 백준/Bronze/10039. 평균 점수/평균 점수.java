import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int score = 0;
        for (int i = 0; i < 5; i++) {
            if ((score = sc.nextInt()) <= 40) {
                score = 40;
            }

            sum += score;
        }

        System.out.println(sum/5);
    }
}
