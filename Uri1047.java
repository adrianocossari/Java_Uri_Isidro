import java.util.Scanner;
public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int horaI, minuI, horaF, minuF, durI, durF, duracaoTotal, durH, durM;

        horaI = teclado.nextInt();
        minuI = teclado.nextInt();
        horaF = teclado.nextInt();
        minuF = teclado.nextInt();

        durI  = horaI * 60 + minuI; // converti tudo para minutos
        durF  = horaF * 60 + minuF; // converti tudo para minutos

        duracaoTotal = durF - durI;

        if (duracaoTotal <= 0){
            duracaoTotal = duracaoTotal + 24*60;  // ou + 1440
        }

        durH = duracaoTotal / 60;
        durM = duracaoTotal % 60;

        System.out.println("O JOGO DUROU "+durH+" HORA(S) E "+durM+" MINUTO(S)");

    }
}