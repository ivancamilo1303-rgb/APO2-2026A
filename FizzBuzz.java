import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese numeros (0 para salir):");

        while (true) {
            System.out.print("Número: ");
            numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("Programa terminado.");
                break;
            }

            if (numero % 3 == 0 && numero % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (numero % 3 == 0) {
                System.out.println("Fizz");
            } else if (numero % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(numero);
            }
        }

        scanner.close();
    }
}
