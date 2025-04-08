import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] buger = new int[3];
        int[] drink = new int[2];

        for (int i = 0; i < 5; i++) {
            if (i < 3) buger[i] = sc.nextInt();
            else drink[i-3] = sc.nextInt();
        }

        int minCost = 9999;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (buger[j] + drink[i] < minCost) minCost = buger[j] + drink[i];
            }
        }

        System.out.println(minCost - 50);
    }
}
