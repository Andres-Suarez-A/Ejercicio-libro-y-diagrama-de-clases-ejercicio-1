import java.util.Scanner;

public class Libro {
    Scanner lectura = new Scanner(System.in);
    private String titulo;
    private String Autor;
    private Double Precio;

    public void Libro (String titulo, String Autor, Double Precio){
        this.Autor = Autor;
        this.titulo = titulo;
        this.Precio = Precio;

    }

    public void mostrarInformacion() {
        System.out.println("titulo:" + titulo);
        System.out.println("Autor:" + Autor);
        System.out.println("Precio:" + Precio);
    }

}

