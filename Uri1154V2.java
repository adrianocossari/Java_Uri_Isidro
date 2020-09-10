import java.util.Scanner;

public class Uri1154V2{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int idade;
        double media=0;
        int qtdeIdades=0;
        while(true){   // faça sempre
            idade = teclado.nextInt();
            if (idade < 0){
                break;       // neste caso, ao ter uma idade negativa, usa o BREAK (mesmo esquema do switch), para sair do loop
            }
            media+=idade;
            qtdeIdades++;
        }
        media = media / qtdeIdades;
        System.out.printf("%.2f\n",media);
    }
}