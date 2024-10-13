package Programas;
import java.util.Scanner;
public class Programa04 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número válido
        System.out.print("Ingrese un numero (1, 2, 3, 4, 6, 12): ");
        int numero = scanner.nextInt();

        // Convertir el número en el nombre del periodo anual utilizando
        String periodo;
        switch (numero) {
            case 1:
                periodo = "mensual";
                break;
            case 2:
                periodo = "bimestral";
                break;
            case 3:
                periodo = "trimestral";
                break;
            case 4:
                periodo = "cuatrimestral";
                break;
            case 6:
                periodo = "semestral";
                break;
            case 12:
                periodo = "anual";
                break;
            default:
                periodo = "Numero fuera del rango permitido";
                break;
        }

        // Mostrar el resultado
        System.out.println("El periodo es: " + periodo);
    }
}