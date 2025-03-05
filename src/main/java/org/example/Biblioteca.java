package org.example;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
//clase principal Biblioteca
public class Biblioteca {
    //creando el Scanner para leer la entrada del usuario
    static Scanner input = new Scanner(System.in);
    //Creando el arreglo que guardará objetos del tipo Libro (y toda su información)
    public static ArrayList<Libro> infoLibro = new ArrayList<>();
    //Método para crear un libro (pide la información necesaria)
    public static void agregarLibro() {
        //variable de control
        boolean aux = true;
        //Se ejecutará hasta que toda la información del libro sea asignada correctamente
        while(aux){
            System.out.println("Ingrese el titulo del libro: ");
            String titulo2 = input.nextLine();

            System.out.println("Ingrese el autor del libro: ");
            String autor2 = input.nextLine();

            System.out.println("Ingrese el año de publicación: ");
            int anio2;
            //manejo de excepciones por si el año ingresado no es válido
            try {
                anio2 = input.nextInt();
                input.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, ingrese un año válido.");
                input.nextLine();
                continue;
            }
            //manejo de excepciones para que no se quede algún dato sin llenar
            System.out.println("Ingrese el género del libro: ");
            String genero2 = input.nextLine();

            if(titulo2.isEmpty() || autor2.isEmpty()){
                System.out.println("Error, debe ingresar Titulo y autor para agregar un libro, intenta nuevamente. ");
            }else{
                //creando un libro con todos sus datos (cierre del bucle)
                Libro nuevo = new Libro(titulo2, autor2, anio2, genero2);
                infoLibro.add(nuevo);
                aux = false;
                System.out.println("Libro agregado con éxito!");

                break;
            }
        }
    }
    //Método para eliminar un libro
    public static void eliminarLibro(){
        System.out.println("Ingrese el titulo del libro que desea eliminar");
        String titulo3 = input.nextLine();
        boolean encontrado = false;
        //Recorriendo el arreglo de libros y confirmando si el título ingresado se encuentra
        for(int i = 0; i<infoLibro.size(); i++){
            if(infoLibro.get(i).getTitulo().equalsIgnoreCase(titulo3)) {
                infoLibro.remove(i);
                encontrado = true;
                System.out.println("El libro " + titulo3 + " ha sido eliminado de la lista ");
                break;
            }
        }
        if(!encontrado){
            System.out.println("Error, no se encontró el libro con el titulo "+titulo3);

        }

    }
    //Método para buscar un libro por uno de sus atributos (en este caso su título)
    public static void buscarPorTitulo(){
        //solicitando el título a buscar
        System.out.println("Ingrese el título del libro a buscar:");
        String NombreL = input.nextLine();
        boolean isencontrado = false;
        //Recorriendo el arreglo para verificar la existencia del libro solicitado
        for(int i = 0; i<infoLibro.size(); i++){
            if(infoLibro.get(i).getTitulo().equalsIgnoreCase(NombreL)){
                System.out.println(infoLibro.get(i));
                isencontrado = true;

                break;
            }
        }
        if(isencontrado == false){
            System.out.println("El libro no se encontró, intente nuevamente. ");

        }
    }
    //Método para buscar un libro por uno de sus atributos (autor)
    public static void buscarPorAutor(){
        //solicitando el nombre del autor a buscar
        System.out.println("Ingrese un autor para buscar su libro e información: ");
        String autor = input.nextLine();
        boolean isencontrado = false;
        //recorriendo el arreglo y verificando la existencia del autor dentro del mismo
        for(int i = 0; i<infoLibro.size();i++){
            if(infoLibro.get(i).getAutor().equalsIgnoreCase(autor)){
                System.out.println(infoLibro.get(i));
                isencontrado = true;

                break;
            }
        }

        if(isencontrado ==false){
            System.out.println("El autor no se encontró, por favor intente de nuevo.");

        }
    }
    //Método para mostrar todos los libros disponibles en la biblioteca
    public static void MostrarLibros(){
        System.out.println("Los libros disponibles son:");
        //verificando si hay algún libro
        if (infoLibro.size() == 0){
            System.out.println("Aún no hay libros agregados");
        //en caso de que sí, imprime cada libro que haya en el arreglo
        }else{
            for(int i = 0; i<infoLibro.size(); i++) {
                System.out.println(infoLibro.get(i));
            }

        }
    }
    //Método menú, para mostrar las opciones disponibles y leer la entrada del usuario
    public static void menu (){

        boolean continuar = true;

        while(continuar){
            System.out.println("-------------------------------------------------------------------");
            System.out.println("------- Bienvenido al software de gestión de biblioteca -----------");
            System.out.println("¿Qué desea hacer? ");
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
                    System.out.println("Muchas gracias por usar el programa, hasta la próxima! ");
                    //cerrando el scanner para optimizar recursos
                    input.close();
                    continuar = false;
                    break;

                default:
                    System.out.println("Ha ingresado una opción no valida, intente de nuevo por favor");
                    break;
            }
        }
        }
}
