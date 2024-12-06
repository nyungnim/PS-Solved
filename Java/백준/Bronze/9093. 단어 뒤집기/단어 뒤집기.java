import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] words = br.readLine().split(" ");
            for (int j = 0; j < words.length; j++) {
                words[j] = new StringBuilder(words[j]).reverse().toString();
            }
            bw.write(String.join(" ", words));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}