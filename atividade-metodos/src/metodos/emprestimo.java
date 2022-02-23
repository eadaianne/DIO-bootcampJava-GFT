package metodos;

public class emprestimo {
    public static void calcEmprestimo(double valorInicial, double taxa, int meses) {
        double valorFinal = valorInicial * Math.pow((1 + taxa/100), meses);
        System.out.println("O valor final a ser pago é: " );
        System.out.format("%.2f", valorFinal);
    }
}
