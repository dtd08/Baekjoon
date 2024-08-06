import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] mbti = sc.next().toCharArray();

        System.out.println(
                (mbti[0] == 'E' ? "I" : "E")
                + (mbti[1] == 'S' ? "N" : "S")
                + (mbti[2] == 'T' ? "F" : "T")
                + (mbti[3] == 'J' ? "P" : "J")
        );
    }
}