public class Uri1155{
    public static void main(String args[]){
        double result;
        int denominador;
        result = 0;
        for (denominador=1; denominador<=100; denominador++){
            result = result + (double)1/denominador;
        }
        System.out.printf("%.2f\n",result);
    }
}