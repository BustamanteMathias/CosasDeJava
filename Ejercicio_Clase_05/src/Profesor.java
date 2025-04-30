public class Profesor extends Persona{
    private String departamento;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Profesor(String nombre, int dni, String email, String departamento){
        super(dni, nombre, email);
        this.departamento = departamento;
    }

    public void dictarClase(){
        System.out.println("dictarClase");
    }

    @Override
    public void MostrarDatos(){
        super.MostrarDatos();
        System.out.println("\tDEPARTAMENTO: " + this.departamento);
    }
}
