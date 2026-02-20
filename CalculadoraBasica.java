import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Ingrese el primer número:");
            double num1 = sc.nextDouble();

            System.out.println("Ingrese el segundo número:");
            double num2 = sc.nextDouble();

            System.out.println("Seleccione una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");

            int opcion = sc.nextInt();
            double resultado;

            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    break;
                case 2:
                    resultado = num1 - num2;
                    break;
                case 3:
                    resultado = num1 * num2;
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("No se puede dividir entre cero.");
                        return;
                    }
                    resultado = num1 / num2;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    return;
            }

            System.out.println("El resultado es: " + resultado);
        }
    }
}