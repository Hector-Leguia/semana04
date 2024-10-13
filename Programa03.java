package Programas;
import java.util.Scanner;
public class Programa03 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entre 1 y 6
        System.out.print("Ingrese un numero entero entre 1 y 6: ");
        int numero = scanner.nextInt();

        // Convertir el número a palabra en inglés utilizando switch-case
        String palabra;
        switch (numero) {
            case 1:
                palabra = "one";
                break;
            case 2:
                palabra = "two";
                break;
            case 3:
                palabra = "three";
                break;
            case 4:
                palabra = "four";
                break;
            case 5:
                palabra = "five";
                break;
            case 6:
                palabra = "six";
                break;
            default:
                palabra = "Numero fuera del rango permitido";
                break;
        }

        // Mostrar el resultado
        System.out.println("El numero en ingles es: " + palabra);
    }
}