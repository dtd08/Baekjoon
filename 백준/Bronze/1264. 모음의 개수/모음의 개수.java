import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vowels = 0;
        String sentence = "";

        while (true) {
            sentence = br.readLine();
            if (sentence.equals("#")) break;

            char[] senToChar = sentence.toLowerCase().toCharArray();

            for(char c : senToChar) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                }
            }

            System.out.println(vowels);
            vowels = 0;
        }
    }
}