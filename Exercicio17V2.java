import java.util.Scanner;

public class Exercicio17V2{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double salario, imposto;

        System.out.println("Digite o salario:");
        salario = teclado.nextDouble();
         
        if (salario < 1000.0){
            imposto = 0.0;
        }
        else if (salario >= 1000.0 && salario < 2500){
            imposto = salario * 12.5/100;
        }
        else if (salario >= 2500 && salario < 5000){
            imposto = salario * 25.0/100;
        } 
        else { // caso 4 - nenhuma das anteriores - é maior que 5000
            imposto = 1300.0;
        }
        System.out.println("Imposto devido R$ "+imposto);

    }
}