import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese numeros (0 para salir):");

        while (true) {
            System.out.print("Numero: ");
            numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("Programa terminado.");
                break;
            }

            if (numero % 3 == 0 && numero % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (numero % 3 == 0) {
                System.out.println("fizz");
            } else if (numero % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(numero);
            }
        }

        scanner.close();
    }
}
