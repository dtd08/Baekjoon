import java.util.Scanner;

// 1157 단어공부
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int[] arr = new int[26];
        int max = -1;
        char ch = '?';

        for(int i=0; i < str.length(); i++) { // 대소문자 확인하며 문자열에 쓰인 알파벳 확인
            if ('a'<=str.charAt(i) && str.charAt(i)<='z') arr[str.charAt(i)-'a']++;
            else arr[str.charAt(i)-'A']++;
        }

        for(int i=0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char)(i+65);
            } else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
