public class PanelControl {
    private Cafetera cafetera;

    public PanelControl(Cafetera cafetera) {
        this.cafetera = cafetera;
    }

    public void presionarEncendido(){
        if (this.cafetera.isEncendido()) {
            this.cafetera.Apagar();
        } else {
            this.cafetera.Encender();
        }
    }

    public void elegirTamaño(String tam){
        this.cafetera.setTamTaza(tam);
    }

    public void prepararCafe(){
        if(!this.cafetera.isTazaLlena()){
            this.cafetera.setTazaLlena(true);
        }
    }

    public void mostrarEstado(){
        System.out.println(this.cafetera.getEstado());;
    }

}
