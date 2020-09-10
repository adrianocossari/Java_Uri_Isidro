import java.util.Scanner;

public class Uri1160{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int PA, PB;
        double G1, G2;
        int anos;
        int T;

        T = teclado.nextInt();

        // aqui eu realmente faço vários casos de testes
        for (int contador = 1; contador <= T; contador++){

            // RESOLVENDO 1 CASO DE TESTES
            // passo 1: li cada um dos parâmetros das cidades
            PA = teclado.nextInt();
            PB = teclado.nextInt();
            G1 = teclado.nextDouble();
            G2 = teclado.nextDouble();

            // passo 2: aplicar a regra de crescimento populacional enquanto a população de A
            //          for menor ou igual a de B (A ainda não ultrapassou B)
            anos=0;
            while(PA <= PB){
                PA = (int)(PA + PA * G1/100);  // preciso "arrendondar" os valores, pois População sempre é um
                PB = (int)(PB + PB * G2/100);  // valor inteiro
                anos++;                        // a cada vez que aplico, conto 1 ano a mais
                
                if (anos > 100){    // este caso é apenas um adendo a uma exigencia o URI para
                    break;          // nao exceder o tempo limite de execução
                }
            }

            // passo 3 - exibir de acordo com o enunciado
            if (anos > 100){
                System.out.println("Mais de 1 seculo.");
            }
            else{
                System.out.println(anos+" anos.");
            }
        }
    }
}