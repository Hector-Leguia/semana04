package Programas;
import java.util.Scanner;
public class Programa02 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar al usuario que ingrese un número entre 1 y 10
        System.out.print("Ingrese un numero entero entre 1 y 10: ");
        int numero = scanner.nextInt();

        // Convertir el número en romano utilizando switch-case
        String romano;
        switch (numero) {
            case 1:
                romano = "I";
                break;
            case 2:
                romano = "II";
                break;
            case 3:
                romano = "III";
                break;
            case 4:
                romano = "IV";
                break;
            case 5:
                romano = "V";
                break;
            case 6:
                romano = "VI";
                break;
            case 7:
                romano = "VII";
                break;
            case 8:
                romano = "VIII";
                break;
            case 9:
                romano = "IX";
                break;
            case 10:
                romano = "X";
                break;
            default:
                romano = "Numero fuera del rango permitido";
                break;
        }
        // Mostrar el resultado
        System.out.println("El numero en romano es: " + romano);
    }
}