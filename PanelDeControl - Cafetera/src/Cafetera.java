public class Cafetera {
    private boolean encendido;
    private String tamTaza;
    private boolean tazaLlena;

    public Cafetera() {
        this.setEstadoEncendido(false);
        this.setTamTaza("chica");
        this.setTazaLlena(false);
    }

    public boolean isTazaLlena() {
        if(!isEncendido()){
            System.out.println("Cafetera Apagada");
        }
        return tazaLlena;
    }

    public void setTazaLlena(boolean tazaLlena) {
        this.tazaLlena = tazaLlena;
    }

    public String getTamTaza() {
        return tamTaza;
    }

    public boolean setTamTaza(String tamTaza) {
        if(isEncendido()){
            if(tamTaza.equals("chica") || tamTaza.equals("mediana") || tamTaza.equals("llena")){
                this.tamTaza = tamTaza;
                System.out.println("Nuevo Tamaño: " + this.tamTaza);
                return true;
            }
        }

        System.out.println("Cafetera Apagada");
        return false;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEstadoEncendido(boolean estadoEncendido) {
        this.encendido = estadoEncendido;
    }

    // FUNCIONALIDAD
    public void Encender(){
        this.setEstadoEncendido(true);
        System.out.println("Encendido.");
    }

    public void Apagar(){
        this.setEstadoEncendido(false);
        System.out.println("Apagado");
    }

    public void seleccionarTamaño(String tam){
        if(isEncendido()){
            if(!this.setTamTaza(tam)){
                System.out.println("[ERROR] Tamaño incorrecto.");
            }
        }else{
            System.out.printf("Cafetera Apagada");
        }
    }

    public void servirCafe(){
        if(isEncendido()){
            this.setTazaLlena(true);
        }else{
            System.out.println("Cafetera Apagada");
        }
    }

    public String getEstado(){
        return this.encendido ?
                "Estado: Encendido" +
                "\nTamaño Taza: " + this.getTamTaza() +
                "\nEstado de Taza: " + (this.isTazaLlena() ? "Llena" : "Vacia") : "Apagado";
    }
}
