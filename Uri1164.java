import java.util.Scanner;
public class Uri1164{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int numero;
        int somaDivisores;
        int numeroTestes;

        numeroTestes = teclado.nextInt();

        for (int contador = 1; contador <= numeroTestes; contador++){
            // para apenas 1 caso de teste
            numero = teclado.nextInt();
            somaDivisores = 0;
            for (int divisor=1; divisor < numero; divisor++){
                if (numero % divisor == 0){ // esse número digitado é realmente divisível pelo valor que variamos
                    somaDivisores = somaDivisores + divisor;
                }
            }
            if (somaDivisores == numero){
                System.out.println(numero+" eh perfeito");
            }
            else{
                System.out.println(numero+" nao eh perfeito");
            }
        }
    }
}