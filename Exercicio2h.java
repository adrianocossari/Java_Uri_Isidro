import java.util.Scanner;
public class Exercicio2h{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float raio, altura, volume, pi;

        System.out.println("Digite o raio e altura do cilindro");
        raio   = teclado.nextFloat();
        altura = teclado.nextFloat(); 
        pi     = 3.14f;  // aqui eu faço atribuição e não leitura!!!

        volume = raio * raio * pi * altura;

        System.out.println("O volume vale = "+volume);

        System.out.printf("O volume com 1 casa decimal vale %.1f\n",volume);
    }
}