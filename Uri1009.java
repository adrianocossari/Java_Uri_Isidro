import java.util.Scanner;
public class Uri1009{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        String nome;
        double salarioBruto, totalVendas, salarioLiquido;

        nome = teclado.nextLine(); // aqui eu leio uma STRING até o ENTER
        salarioBruto = teclado.nextDouble();
        totalVendas  = teclado.nextDouble();

        salarioLiquido = salarioBruto + totalVendas*15.0/100.00;

        System.out.printf("TOTAL = R$ %.2f\n",salarioLiquido);
    }
}