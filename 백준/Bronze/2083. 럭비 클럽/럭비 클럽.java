import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] info;

        while (true) {
            info = sc.nextLine().split(" ");

            if (info[0].equals("#")) break;

            if (Integer.parseInt(info[1]) > 17 || Integer.parseInt(info[2]) >= 80) {
                System.out.println(info[0] + " Senior");
            } else {
                System.out.println(info[0] + " Junior");
            }
        }
    }
}