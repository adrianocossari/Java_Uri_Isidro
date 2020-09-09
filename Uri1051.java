import java.util.Scanner;

public class Uri1051{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double salario, imposto;


        salario = teclado.nextDouble();
        if (salario <= 2000.0){
            System.out.println("Isento");
        }
        else if (salario > 2000.0 && salario <= 3000){
            imposto = (salario - 2000.0)*0.08;
            System.out.printf("R$ %.2f\n",imposto);
        }
        else if (salario > 3000.0 && salario <= 4500){
            imposto = (salario - 3000.0)*0.18 + 80.0; // 80,00 que são 8% na faixa dos 2000 a 3000
            System.out.printf("R$ %.2f\n",imposto);
        }
        else{
            imposto = (salario - 4500.0)*0.28 + 270.0 + 80.0;// 270 = 18% de 1500,00 (faixa dos 3000 a 4500) e os 80 da faixa dos 2000 a 3000
            System.out.printf("R$ %.2f\n",imposto);
        }
    }
}