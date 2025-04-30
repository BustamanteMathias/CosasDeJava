public class Administrativo extends Persona{
    private String sector;

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Administrativo(String nombre, int dni, String email, String sector){
        super(dni, nombre, email);
        this.sector = sector;
    }

    public void gestionarTramite(){
        System.out.println("gestionarTramite");
    }

    @Override
    public void MostrarDatos(){
        super.MostrarDatos();
        System.out.println("\tSECTOR: " + this.sector);
    }
}
