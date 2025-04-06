import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int second = sc.nextInt();
        int cost = sc.nextInt();


        hour += (int)(cost/3600);
        cost -= (int)(cost/3600) * 3600;

        minute += (int)(cost/60);
        cost -= (int)(cost/60) * 60;

        second += cost;
        cost = 0;


        if (second >= 60) {
            minute += (int)(second/60);
            second %= 60;
        }

        if (minute >= 60) {
            hour += (int)(minute/60);
            minute %= 60;
        }

        if (hour >= 24) {
            hour %= 24;
        }

        System.out.println(hour + " " + minute + " " + second);
    }
}
