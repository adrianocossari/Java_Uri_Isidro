import java.util.Scanner;

public class TesteDoWhile{
    public static void main(String args[]){
        int opcao;
        Scanner teclado= new Scanner(System.in);

    
        do{
            System.out.println("Digite 1 para deposito / 2 para saque / 3 para extrato / 0 para sair");
            opcao = teclado.nextInt();
        } while (opcao != 0);
    }
}