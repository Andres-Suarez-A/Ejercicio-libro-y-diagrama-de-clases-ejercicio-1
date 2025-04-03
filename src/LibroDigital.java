public class LibroDigital extends Libro {
    private double tamanoArchivo;

    public LibroDigital(String Autor, String Titulo, double precio, double tamanoArchivo){
        super();
        this.tamanoArchivo = Integer.parseInt(String.valueOf(tamanoArchivo));
    }
    public void mostrarInfo(){
        super.toString();
        System.out.println("tamanoArchivo:"+ tamanoArchivo +"mb");
    }

}
