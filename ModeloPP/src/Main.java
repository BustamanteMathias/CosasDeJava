import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Publicacion> listaDePublicaciones = new ArrayList<>();
        Libro l = new Libro("Titulo", LocalDate.now(), "Autor", Libro.EGenero.CIENCIA);
        Revista r = new Revista("Titulo", LocalDate.now(), 1);
        Ilustracion i = new Ilustracion("Titulo", LocalDate.now(), "Nombre", 100.50, 50.25);

        if (!Publicacion.AgregarPublicacion(listaDePublicaciones, l)) {
            System.out.println("Repetido");
        }
        if (!Publicacion.AgregarPublicacion(listaDePublicaciones, l)) {
            System.out.println("Repetido");
        }
        Publicacion.AgregarPublicacion(listaDePublicaciones, r);
        Publicacion.AgregarPublicacion(listaDePublicaciones, i);
        Publicacion.LeerPublicaciones(listaDePublicaciones);
        Publicacion.MostrarPublicaciones(listaDePublicaciones);
    }
}