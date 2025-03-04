package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner opcion = new Scanner(System.in);
        int op = opcion.nextInt();
        while (true) {
            try {
                System.out.println("Bienvenido a la Biblioteca JJD");
                System.out.println("Por favor seleccione qué desea hacer:");
                System.out.println("1. Agregar un libro");
                System.out.println("2. Buscar un libro por título");
                System.out.println("3. Buscar un libro por autor");
                System.out.println("4. Eliminar un libro");
                System.out.println("5. Visualizar todos los libros disponibles");
                System.out.println("6. Salir del programa");

                System.out.print("Ingrese una opción: ");

                if (op >= 1 && op <= 6) {
                    break;
                } else {
                    System.out.println("Por favor, seleccione una opción válida (1-6).");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido.");
            }
        }
        switch (op) {
            case 1:
                System.out.println("Opción 1 seleccionada: Agregar un libro.");
                break;
            case 2:
                System.out.println("Opción 2 seleccionada: Buscar un libro por título.");
                break;
            case 3:
                System.out.println("Opción 3 seleccionada: Buscar un libro por autor.");
                break;
            case 4:
                System.out.println("Opción 4 seleccionada: Eliminar un libro.");
                break;
            case 5:
                System.out.println("Opción 5 seleccionada: Visualizar todos los libros disponibles.");
                break;
            case 6:
                System.out.println("Saliendo del programa...");
                break;
        }
        }
    }
