public class Continhas{
    public static void main(String args[]){
        int a,b,c;

        a = 14;
        b = 4;

        c = a + b;
        System.out.println("Valor da soma = " + c);

        c = a - b;
        System.out.println("Valor da subt = " + c);

        c = a * b;
        System.out.println("Valor da mult = " + c);

        c = a / b;
        System.out.println("Valor da divi = " + c);

        c = a % b;
        System.out.println("Valor do resto = " + c);

        float x;
        x = 1.0f/3;

        System.out.println("Valor do x = " + x);
        System.out.printf("Valor do x = %.2f   -   %.5f  -  %.3f\n",x,x,x);

        /* possíveis máscaras

        %f para valores reais (float ou double)
            %.2f -> vou mostrar o valor com 2 casas após o .
            valor 5.3333 -->  "5.33"
            valor 1000   -->  "1000.00"
            
            %8.2f -> vou mostrar o valor com 8 dígitos, sendo q 2 após o . (contando o .)
            valor 3.1234 -->  "    3.12"
              
            
        %d para valores inteiros
            %5d -> vou mostrar o valor com no mínimo 5 dígitos
            valor 10 ==> "   10"
            valor 2  ==> "    2"
        %s para textos


        */


    }
}