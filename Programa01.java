package Programas;

import java.util.Scanner;

public class Programa01 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entre 1 y 5
        System.out.print("Ingrese un numero entero entre 1 y 5: ");
        int numero = scanner.nextInt();

        // Convertir el número en palabra utilizando switch-case
        String palabra;
        switch (numero) {
            case 1:
                palabra = "uno";
                break;
            case 2:
                palabra = "dos";
                break;
            case 3:
                palabra = "tres";
                break;
            case 4:
                palabra = "cuatro";
                break;
            case 5:
                palabra = "cinco";
                break;
            default:
                palabra = "Numero fuera del rango permitido";
                break;
        }

        // Mostrar el resultado
        System.out.println("El numero ingresado es: " + palabra);
    }
}