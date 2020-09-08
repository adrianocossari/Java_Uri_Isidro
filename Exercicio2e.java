import java.util.Scanner;
public class Exercicio2e{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int baseMaior, baseMenor, altura, area;

        System.out.println("Digite a base Maior, a base menor e a altura:");
        baseMaior = teclado.nextInt();
        baseMenor = teclado.nextInt();
        altura    = teclado.nextInt();

        area = (baseMaior + baseMenor) * altura / 2;

        System.out.println("Area do trapezio = "+area);
    }
}