public class LibroImpreso extends Libro {
    private Double peso;
    private LibroImpreso Super;

    public LibroImpreso(String s, String number, double s1, double gabrielGarciaMarquez) {
    }

    private void Super(String titulo, Double precio, Double peso, String autor) {
        Super(titulo, precio, peso, autor);
        this.peso = peso;
    }
    public void mostrarInformacion(){
        Super.mostrarInformacion();
        System.out.println("peso:"+peso+"Kg");
    }

    public Double getPeso() {
        return peso;
    }
}
