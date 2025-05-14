import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 비트 입력
        String[] a =br.readLine().split("");
        String[] b =br.readLine().split("");
        
        // 연산 결과 보관 변수
        StringBuilder res = new StringBuilder();

        // 반복 횟수
        int repeat = 100000;


        // & 연산
        for (int i = 0; i < repeat; i++) {
            res.append(((a[i].equals("1") && b[i].equals("1")) ? "1":"0"));
        }
        System.out.println(res);
        res.delete(0, res.length());


        // | 연산
        for (int i = 0; i < repeat; i++) {
            res.append(((a[i].equals("1") || b[i].equals("1")) ? "1":"0"));
        }
        System.out.println(res);
        res.delete(0, res.length());


        // ^ 연산
        for (int i = 0; i < repeat; i++) {
            res.append(((!a[i].equals(b[i])) ? "1":"0"));
        }
        System.out.println(res);
        res.delete(0, res.length());


        // ~a 연산
        for (int i = 0; i < repeat; i++) {
            res.append(((a[i].equals("1")) ? "0":"1"));
        }
        System.out.println(res);
        res.delete(0, res.length());


        // ~b 연산
        for (int i = 0; i < repeat; i++) {
            res.append(((b[i].equals("1")) ? "0":"1"));
        }
        System.out.println(res);
        res.delete(0, res.length());
    }
}