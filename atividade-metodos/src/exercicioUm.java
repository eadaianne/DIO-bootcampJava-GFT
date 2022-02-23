import java.util.Scanner;

import static metodos.calculadora.*;
import static metodos.relogio.*;
import static metodos.emprestimo.*;

public class exercicioUm {
    public static void main(String[] args) {
        System.out.println("Menu \n" +
                "Digite 1 para abrir a calculadora.\n" +
                "Digite 2 para abrir o relógio. \n" +
                "Digite 3 para abrir o cálculo de empréstimo. \n");

        int menu;

        Scanner leMenu = new Scanner(System.in);
        menu = leMenu.nextInt();

        switch (menu) {
            case 1:
                double valor1, valor2, resultado;

                System.out.println("Insira os valores.");
                Scanner leitor1 = new Scanner(System.in);
                valor1 = leitor1.nextDouble();
                valor2 = leitor1.nextDouble();

                resultado = soma(valor1, valor2);
                System.out.println("Soma = " + resultado);
                resultado = subtracao(valor1, valor2);
                System.out.println("Subtração = " + resultado);
                resultado = multiplicacao(valor1, valor2);
                System.out.println("Multiplicação = " + resultado);
                resultado = divisao(valor1, valor2);
                System.out.println("Divisão = " + resultado);
                break;

            case 2:
                int horaDia;
                System.out.println("Informe o horário em formato 24 horas.");
                Scanner leitor2 = new Scanner(System.in);
                horaDia = leitor2.nextInt();

                if (7 <= horaDia && horaDia < 12) {
                    manha();
                }
                if (12 <= horaDia && horaDia < 18) {
                    tarde();
                } else
                    noite();
                break;
            case 3:
                double valorInicial, taxa;
                int meses;

                System.out.println("Insira o valor inicial do empréstimo, a taxa de juros e o número de parcelas.");
                Scanner leitor3 = new Scanner(System.in);
                valorInicial = leitor3.nextDouble();
                taxa = leitor3.nextDouble();
                meses = leitor3.nextInt();

                calcEmprestimo(valorInicial, taxa, meses);
                break;
        }
    }

}