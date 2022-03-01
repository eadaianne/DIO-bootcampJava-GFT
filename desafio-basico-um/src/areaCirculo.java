import java.util.Scanner;

public class areaCirculo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double raio = scan.nextDouble();
        double area;

        area = 3.14159 * (Math.pow(raio, 2));

        System.out.printf("A=%.4f\n", area);
    }
}