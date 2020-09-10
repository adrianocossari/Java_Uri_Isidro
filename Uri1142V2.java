import java.util.Scanner;
public class Uri1142V2{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N;

        N = teclado.nextInt(); // ler a quantidade de linhas
        for (int valor=1; valor <= 4*N; valor++){
            if (valor % 4 == 0){
                System.out.println("PUM");
            }
            else{
                System.out.print(valor+" ");
            }
        }
        
    }
}