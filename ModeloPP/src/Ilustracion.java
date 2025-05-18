import java.time.LocalDate;

public class Ilustracion extends Publicacion {
    private String nombre;
    private double dimX;
    private double dimY;

    public Ilustracion(String titulo, LocalDate fechaDePublicacion, String nombreDelIlustrador, double dimX, double dimY) {
        super(titulo, fechaDePublicacion);
        this.nombre = nombreDelIlustrador;
        this.dimX = dimX;
        this.dimY = dimY;
    }

    @Override
    public String toString() {
        return "Ilustracion [ilustrador=" + nombre + ", ancho=" + dimX + ", alto=" + dimY + "]";
    }
}
