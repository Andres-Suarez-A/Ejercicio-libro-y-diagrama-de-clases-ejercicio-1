import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final ArrayList<Libro> biblioteca = new ArrayList<>();

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu:");
            System.out.println("1. Agregar libro impreso");
            System.out.println("2. Agregar libro digital");
            System.out.println("3. Mostrar libros");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    agregarLibroImpreso(teclado);
                    break;
                case 2:
                    agregarLibroDigital(teclado);
                    break;
                case 3:
                    mostrarLibros();
                    break;
                case 4:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (opcion != 4);
    }

    private static void mostrarLibros() {
        if (biblioteca.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            for (Libro libro : biblioteca) {
                libro.mostrarInformacion();
                System.out.println("--------------");
            }
        }
    }

    public static void agregarLibroImpreso(Scanner teclado) {
        System.out.print("Ingrese el titulo del libro: ");
        String titulo = teclado.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        String autor = teclado.nextLine();
        System.out.print("Ingrese el precio del libro: ");
        double precio = teclado.nextDouble();
        System.out.print("Ingrese el peso del libro (kg): ");
        double peso = teclado.nextDouble();
        teclado.nextLine();

        LibroImpreso libroImpreso = new LibroImpreso(titulo, autor, precio, peso);
        biblioteca.add(libroImpreso);
    }

    public static void agregarLibroDigital(Scanner teclado) {
        System.out.print("Ingrese el titulo del libro: ");
        String titulo = teclado.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        String autor = teclado.nextLine();
        System.out.print("Ingrese el precio del libro: ");
        double precio = teclado.nextDouble();
        System.out.print("Ingrese el tamaño del archivo (MB): ");
        double tamanoArchivo = teclado.nextDouble();
        teclado.nextLine();

        LibroDigital libroDigital = new LibroDigital(titulo, autor, precio, tamanoArchivo);
        biblioteca.add(libroDigital);
    }
}
