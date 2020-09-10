import java.util.Scanner;

public class Uri1154{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int idade;
        double media=0;
        int qtdeIdades=0;
        do{
            idade = teclado.nextInt(); // li a idade
            if (idade >= 0){            // é uma idade válida?
               media = media + idade;  // media += idade;  acumulo a idade digitada na média
               qtdeIdades++;
            }
        } while(idade >= 0);
        media = media / qtdeIdades;
        System.out.printf("%.2f\n",media);
    }
}