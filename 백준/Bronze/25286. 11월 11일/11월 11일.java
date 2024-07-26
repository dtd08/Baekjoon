import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = 31;

            if (month == 3) {
                if ((year % 4 == 0 && year % 100 != 0)
                        || year % 400 == 0) {
                    day = 29;
                } else {
                    day = 28;
                }
                month--;
            } else if (month == 5 || month == 7 || month == 10 || month == 12) {
                month--;
                day = 30;
            } else if (month == 1){
                year--;
                month = 12;
            } else {
                month--;
            }

            System.out.printf("%d %d %d\n", year, month, day);
        }
    }
}
