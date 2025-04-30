//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Estudiante e = new Estudiante("Juan", 40000000, "mail@mail.com", "A1234");
        Administrativo a = new Administrativo("Juan", 40000000, "mail@mail.com", "A1");
        Profesor p = new Profesor("Juan", 40000000, "mail@mail.com", "D1");

        e.inscribirseCurso();
        a.gestionarTramite();
        p.dictarClase();

        e.MostrarDatos();
        a.MostrarDatos();
        p.MostrarDatos();
    }
}