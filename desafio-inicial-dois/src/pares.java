import java.io.IOException;
import java.util.Scanner;

public class pares {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        int i = 2;

        if (num % 2 == 0) {
            while (i <= num) {
                System.out.println(i + "\n");
                i = i + 2;
            }
        } else {
            while (i < num) {
                System.out.println(i + "\n");
                i = i + 2;
            }
        }

    }
}
