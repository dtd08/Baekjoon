import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] str = sc.next().toCharArray();
        String vowels = "aeiou";
        int cnt = 0;

        for (int i = 0; i < str.length; i++) {
            if (vowels.contains(String.valueOf(str[i]))) cnt++;
        }

        System.out.println(cnt);
    }
}
