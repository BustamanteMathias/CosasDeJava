public class Estudiante extends Persona {
    private String legajo;

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public Estudiante(String nombre, int dni, String email, String legajo){
        super(dni, nombre, email);
        this.legajo = legajo;
    }

    public void inscribirseCurso(){
        System.out.println("inscribirseCurso");
    }

    @Override
    public void MostrarDatos(){
        super.MostrarDatos();
        System.out.println("\tLEGAJO: " + this.legajo);
    }
}
