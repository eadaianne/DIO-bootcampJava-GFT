import java.util.Scanner;

public class areas {
    public static void main(String[] args) {

        double ladoQuadrado, ladoUmRetangulo, ladoDoisRetangulo, baseMenorTrapezio, baseMaiorTrapezio, altura, areaQ, areaR, areaT;

        System.out.println("Informe os valores do lado do quadrado, lados do retângulo e bases menor, maior e altura do trapézio.");

        Scanner entradas  = new Scanner(System.in);
        ladoQuadrado = entradas.nextDouble();
        ladoUmRetangulo = entradas.nextDouble();
        ladoDoisRetangulo = entradas.nextDouble();
        baseMenorTrapezio = entradas.nextDouble();
        baseMaiorTrapezio = entradas.nextDouble();
        altura = entradas.nextDouble();

        areaQ = area(ladoQuadrado);
        areaR = area(ladoUmRetangulo, ladoDoisRetangulo);
        areaT = area(baseMenorTrapezio, baseMaiorTrapezio, altura);

        System.out.println("A área do quadrado é: " +areaQ);
        System.out.println("A área do retângulo é: " +areaR);
        System.out.println("A área do trapézio é: " +areaT);
    }

    public static double area(double ladoQuadrado) {
        return ladoQuadrado * ladoQuadrado;
    }

    public static double area(double ladoUmRetangulo, double ladoDoisRetangulo) {
        return ladoUmRetangulo * ladoDoisRetangulo;
    }

    public static double area(double baseMenorTrapezio, double baseMaiorTrapezio, double altura) {
        return ((baseMaiorTrapezio + baseMenorTrapezio) * altura / 2);
    }

}
