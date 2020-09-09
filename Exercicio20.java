import java.util.Scanner;

public class Exercicio20{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double altura;
        char   sexo;
        double pesoIdeal;

        System.out.println("Digite F/f para Feminino ou M/m para Masculino");
        sexo   = teclado.nextLine().charAt(0);
        System.out.println("Digite a altura em metros");
        altura = teclado.nextDouble();

        switch(sexo){
            case 'F':
            case 'f':
                pesoIdeal = 62.1 * altura - 44.7;
                System.out.printf("Seu peso ideal feminino é de %.2f kg\n",pesoIdeal);
                break;
            case 'M':
            case 'm':
                pesoIdeal = 72.7 * altura - 58;
                System.out.printf("Seu peso ideal masculino é de %.2f kg\n",pesoIdeal);
                break;
            default:
                System.out.println("Valores nao reconhecidos");
        }
        
    }
}