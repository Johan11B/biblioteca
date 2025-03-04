package org.example;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Biblioteca {
    static Scanner input = new Scanner(System.in);
    public static ArrayList<Libro> array = new ArrayList<>();

    public static void agregarLibro() {
        boolean aux = true;

        while(aux){
            System.out.println("Ingresa el titulo del libro: ");
            String titulo2 = input.nextLine();

            System.out.println("Ingresa el autor del libro: ");
            String autor2 = input.nextLine();

            System.out.println("Ingresa el anio de publicacion: ");
            int anio2;

            try {
                anio2 = input.nextInt();
                input.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un año válido.");
                input.nextLine(); // Limpiar buffer
                continue;
            }

            System.out.println("Ingresa el genero del libro: ");
            String genero2 = input.nextLine();

            if(titulo2.isEmpty() || autor2.isEmpty()){
                System.out.println("Error, debes ingresar Titulo y autor para agregar un libro, intenta nuevamente. ");
            }else{
                Libro nuevo = new Libro(titulo2, autor2, anio2, genero2);
                array.add(nuevo);
                aux = false;
                System.out.println("Libro agregado con exito! continua con el menu");
                break;
            }
        }
    }

    public static void eliminarLibro(){
        System.out.println("Ingresa el titulo del libro que quieres eliminar");
        String titulo3 = input.nextLine();
        boolean encontrado = false;

        for(int i = 0; i<array.size(); i++){
            if(array.get(i).getTitulo().equalsIgnoreCase(titulo3)) {
                array.remove(i);
                encontrado = true;
                System.out.println("El libro" + titulo3 + " ha sido eliminado de la lista ");
                break;
            }
        }

        if(!encontrado){
            System.out.println("Error, no se encontro el libro con el titulo "+titulo3);
        }

    }

    public static void buscarPorTitulo(){

        System.out.println("Ingresa el titulo del libro a buscar");
        String NombreL = input.nextLine();
        boolean isencontrado = false;

        for(int i = 0; i<array.size(); i++){
            if(array.get(i).getTitulo().equalsIgnoreCase(NombreL)){
                System.out.println(array.get(i));
                isencontrado = true;
                break;
            }
        }
        if(isencontrado == false){
            System.out.println("El libro no se encontro, intenta nuevamente. ");
        }
    }

    public static void buscarPorAutor(){

        System.out.println("Ingresa un autor para buscar su libro e informacion: ");
        String autor = input.nextLine();
        boolean isencontrado = false;

        for(int i = 0; i<array.size();i++){
            if(array.get(i).getAutor().equalsIgnoreCase(autor)){
                System.out.println(array.get(i));
                isencontrado = true;
                break;
            }
        }

        if(isencontrado ==false){
            System.out.println("El autor no se encontro, por favor intenta de nuevo");
        }
    }

    public static void MostrarLibros(){
        for(int i = 0; i<array.size(); i++){
            System.out.println(array.get(i));
        }
    }

    public static void menu (){

        boolean continuar = true;

        while(continuar){
            System.out.println("-------------------------------------------------------------------");
            System.out.println("------- Bienvenido al software de gestion de biblioteca -----------");
            System.out.println("Que quieres hacer? ");
            System.out.println("1. Agregar un libro ");
            System.out.println("2. Eliminar un libro ");
            System.out.println("3. Buscar libro por titulo");
            System.out.println("4. Buscar libro por autor ");
            System.out.println("5. Imprimir libros");
            System.out.println("6. Salir ");
            int opcion = input.nextInt();
            input.nextLine();

            switch (opcion){
                case 1:
                    agregarLibro();
                    break;

                case 2:
                    eliminarLibro();
                    break;

                case 3:
                    buscarPorTitulo();
                    break;

                case 4:
                    buscarPorAutor();
                    break;

                case 5:
                    MostrarLibros();
                    break;

                case 6:
                    System.out.println("Muchas gracias por usar el programa, hasta la proxima! ");
                    continuar = false;
                    break;

                default:
                    System.out.println("Ingresaste una opcion no valida, intenta de nuevo por favor");
                    break;
            }
        }
        }
}
