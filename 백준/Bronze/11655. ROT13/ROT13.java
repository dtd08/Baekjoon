import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] upAl = new char[26];
        char[] lowAl = new char[26];
        char[] sentence = sc.nextLine().toCharArray();

        for (int i = 0; i < 26; i++) {
            upAl[i] = (char)('A' + i);
            lowAl[i] = (char)('a' + i);
        }

        for (char c : sentence) {
            if (c >= 'A' && c <= 'Z') System.out.print(upAl[((c - 52) % 26)]);
            else if (c >= 'a' && c <= 'z') System.out.print(lowAl[((c - 84) % 26)]);
            else System.out.print(c);
        }
    }
}
