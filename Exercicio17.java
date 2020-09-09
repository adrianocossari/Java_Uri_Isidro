import java.util.Scanner;

public class Exercicio17{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double salario, imposto;

        System.out.println("Digite o salario:");
        salario = teclado.nextDouble();
        
        // caso 1 - testo se o salário é menor que 1000
        if (salario < 1000.0){
            imposto = 0.0;
        }
        else{ // caso 2 - verifico se está entre 1000 e 2500
            if (salario >= 1000.0 && salario < 2500){
                imposto = salario * 12.5/100;
            }
            else{  // caso 3 - verifico se esta entre 2500 e 5000
                if (salario >= 2500 && salario < 5000){
                    imposto = salario * 25.0/100;
                } 
                else{ // caso 4 - nenhuma das anteriores - é maior que 5000
                    imposto = 1300.0;
                }
            }
        }
        System.out.println("Imposto devido R$ "+imposto);

    }
}