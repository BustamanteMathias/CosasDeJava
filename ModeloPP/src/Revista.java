import java.time.LocalDate;

public class Revista extends Publicacion implements ILeer {
    private int numeroDeEdicion;

    public Revista(String titulo, LocalDate fechaDePublicacion, int numeroDeEdicion) {
        super(titulo, fechaDePublicacion);
        this.numeroDeEdicion = numeroDeEdicion;
    }

    @Override
    public void Leer() {
        System.out.println("Leyendo Revista... Edicion: " + numeroDeEdicion);
    }

    @Override
    public String toString() {
        return "Revista [numeroEdicion=" + numeroDeEdicion + "]";
    }
}
