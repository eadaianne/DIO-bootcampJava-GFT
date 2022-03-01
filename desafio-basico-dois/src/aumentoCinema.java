import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class aumentoCinema {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        //Escreva aqui a sua lógica

        double diferenca = B - A;
        double aumento = (diferenca / A) * 100;

        DecimalFormat deci = new DecimalFormat("0.00");
        System.out.println(deci.format(aumento) + "%");
    }

}