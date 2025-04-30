public class Persona {
    protected String nombre;
    protected int dni;
    protected String email;

    public Persona(int dni, String nombre, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
    }

    public void MostrarDatos(){
        System.out.printf("[DATOS]\n");
        System.out.printf("\tNOMBRE: " + this.nombre);
        System.out.printf("\tDNI: " + this.dni);
        System.out.printf("\tEMAIL: " + this.dni);
    }
}
