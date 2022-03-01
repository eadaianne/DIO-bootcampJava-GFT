import java.util.Scanner;

public class feira {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int a = leitor.nextInt();
        int b = leitor.nextInt();

        int total = a + b;
        System.out.println("X = " + total);
    }
}