import java.util.Scanner;
public class Uri1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N, valor;

        N = teclado.nextInt(); // ler a quantidade de linhas
        valor = 1;

        for (int contador=1;contador<=N; contador++){
            System.out.println(valor+ " " + (valor+1)+" "+(valor+2)+ " PUM");
            valor += 4; // valor = valor + 4;
        }
    }
}