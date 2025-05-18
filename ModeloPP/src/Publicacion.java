import java.time.LocalDate;
import java.util.List;

public abstract class Publicacion {
    protected String titulo;
    protected LocalDate fechaDePublicacion;

    protected Publicacion(String titulo, LocalDate fechaDePublicacion) {
        this.titulo = titulo;
        this.fechaDePublicacion = fechaDePublicacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (this.getClass() != o.getClass()) {
            return false;
        }

        return this.titulo.equals(((Publicacion) o).titulo) && this.fechaDePublicacion == ((Publicacion) o).fechaDePublicacion;
    }

    public static boolean AgregarPublicacion(List<Publicacion> listaDePublicaciones, Publicacion p) {
        if (!listaDePublicaciones.contains(p)) {
            listaDePublicaciones.add(p);
            return true;
        }

        return false;
    }

    public static boolean MostrarPublicaciones(List<Publicacion> listaDePublicaciones) {
        if (listaDePublicaciones != null && !listaDePublicaciones.isEmpty()) {
            for (Publicacion p : listaDePublicaciones) {
                System.out.println(p);
            }
            return true;
        }
        return false;
    }

    public static int LeerPublicaciones(List<Publicacion> listaDePublicaciones) {
        int count = 0;
        for (Publicacion p : listaDePublicaciones) {
            if (p instanceof ILeer) {
                ((ILeer) p).Leer();
                count++;
            }
        }

        return count;
    }
}