import java.util.Scanner;
public class Uri1060{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float valor;

        int contador;
        int numeroDePositivos=0;

        for (contador = 1; contador <= 6 ; contador = contador + 1){ // contando de 1 a 6
            // sei ler 1 valor
            valor = teclado.nextFloat();
            if (valor > 0){
                numeroDePositivos = numeroDePositivos+1; // ou seja, se o valor lido for positivo, eu não mostro msg, mas acumulo +1
            }
        }
        System.out.println(numeroDePositivos+" valores positivos");
    }
}