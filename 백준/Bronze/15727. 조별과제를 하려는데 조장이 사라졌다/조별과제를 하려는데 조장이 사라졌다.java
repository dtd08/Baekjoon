import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float L = Float.parseFloat(br.readLine());

        System.out.println((long)(Math.ceil(L/5)));
    }
}