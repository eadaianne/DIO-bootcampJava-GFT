import java.util.Scanner;

public class areas {
    public static void main(String[] args) {

        double ladoQuadrado, ladoUmRetangulo, ladoDoisRetangulo, baseMenorTrapezio, baseMaiorTrapezio, altura;

        System.out.println("Informe os valores do lado do quadrado, lados do retângulo e bases menor, maior e altura do trapézio.");

        Scanner entradas = new Scanner(System.in);
        ladoQuadrado = entradas.nextDouble();
        ladoUmRetangulo = entradas.nextDouble();
        ladoDoisRetangulo = entradas.nextDouble();
        baseMenorTrapezio = entradas.nextDouble();
        baseMaiorTrapezio = entradas.nextDouble();
        altura = entradas.nextDouble();

        area(ladoQuadrado);
        area(ladoUmRetangulo, ladoDoisRetangulo);
        area(baseMenorTrapezio, baseMaiorTrapezio, altura);

    }

    public static void area(double ladoQuadrado) {
        System.out.println("A área do quadrado é: " + ladoQuadrado * ladoQuadrado);
    }

    public static void area(double ladoUmRetangulo, double ladoDoisRetangulo) {
        System.out.println("A área do retângulo é: " + ladoUmRetangulo * ladoDoisRetangulo);
    }

    public static void area(double baseMenorTrapezio, double baseMaiorTrapezio, double altura) {
        System.out.println("A área do trapézio é: " + ((baseMaiorTrapezio + baseMenorTrapezio) / 2) * altura);
    }

}
