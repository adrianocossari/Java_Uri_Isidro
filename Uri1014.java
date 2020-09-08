import java.util.Scanner;

public class Uri1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int X;    // distancia em KM
        float Y;  // litros consumidos

        X = teclado.nextInt();
        Y = teclado.nextFloat();
        float consumo = X/Y;

        System.out.printf("%.3f km/l\n", consumo);

    }
}