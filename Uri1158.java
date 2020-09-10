import java.util.Scanner;
public class Uri1158{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int X, Y, soma, N;

        N = teclado.nextInt();
        for (int cont = 1; cont <= N ; cont++){
            // 1 caso de testes

            X = teclado.nextInt();  // valor inicial (pode ser par ou impar)
            Y = teclado.nextInt();  // quantos ímpares a partir do valor inicial

            if (X % 2 == 0){  // se X for par, adiciono 1 para torna-lo ímpar
                X++;          // agora X é ímpar
            }
            soma = 0;
            for (int contador=1; contador<=Y; contador++){
                soma = soma + X;
                X = X+2;
            }
            System.out.println(soma);
        }
    }
}