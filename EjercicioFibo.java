import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el término de la serie Fibonacci que desea calcular: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("El término debe ser mayor que 0");
            return;
        }

        // Declarar el arreglo
        int[] fibo = new int[n];

        // Inicializar los primeros términos
        fibo[0] = 1;
        if (n > 1) {
            fibo[1] = 1;
        }

        // Calcular la serie con un ciclo for
        for (int i = 2; i < n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        // Mostrar la serie
        System.out.println("Serie Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibo[i] + " ");
        }

        // Mostrar el término solicitado
        System.out.println("\nEl término " + n + " es: " + fibo[n - 1]);
    }
}
