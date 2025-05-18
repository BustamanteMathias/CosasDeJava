import java.time.LocalDate;

public class Libro extends Publicacion implements ILeer {
    public enum EGenero {
        FICCION, NO_FICCION, CIENCIA, HISTORIA
    }

    private String autor;
    private EGenero genero;

    public Libro(String titulo, LocalDate fechaDePublicacion, String autor, EGenero genero) {
        super(titulo, fechaDePublicacion);
        this.autor = autor;
        this.genero = genero;
    }

    @Override
    public void Leer() {
        System.out.println("Leyendo Libro... Autor: " + autor + " - Genero: " + genero);
    }

    @Override
    public String toString() {
        return "Libro [autor=" + autor + ", genero=" + genero + "]";
    }
}
