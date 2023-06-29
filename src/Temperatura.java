import java.util.Scanner;


public class Temperatura {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);


        System.out.println("Entre com uma temperatura em Celsius para saber seu equivalente em Fahrenheit: ");
        double celsius = leitura.nextDouble();
        double f = (celsius * 1.8) + 32;
        System.out.println("O equivalente a " + celsius + " é " + f +"F." );

    }



}
