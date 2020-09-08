import java.util.Scanner;
public class Exercicio2b{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        // entradas: base e a altura
        // saída   : area

        int base, altura, area;
        System.out.println("Digite a base e a altura do retangulo");
        base   = teclado.nextInt();
        altura = teclado.nextInt();

        area   = base * altura;

        System.out.println("A area do retangulo = "+area);

        
        
    }
}