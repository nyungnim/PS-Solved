import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder operations = new StringBuilder();
        int current = 1;

        for (int num : sequence) {
            while (current <= num) {
                stack.push(current++);
                operations.append("+\n");
            }
            if (!stack.isEmpty() && stack.peek() == num) {
                stack.pop();
                operations.append("-\n");
            } else {
                System.out.println("NO");
                return;
            }
        }

        System.out.print(operations.toString());
    }
}