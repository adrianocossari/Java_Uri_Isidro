import java.util.Scanner;
public class Exercicio2c{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int base, altura, area;
        // definindo a entrada
        System.out.println("Digite a base e a altura do triangulo");
        base   = teclado.nextInt();
        altura = teclado.nextInt();

        // definindo o processamento
        area = base * altura / 2;

        // definindo a saída
        System.out.println("A área do triangulo = "+area);


    }

}