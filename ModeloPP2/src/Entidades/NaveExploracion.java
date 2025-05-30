package Entidades;

public class NaveExploracion extends Nave{
    private TipoMision tipoMision;

    public NaveExploracion(String nombre, int capacidadTripulacion, int anioDeLanzamiento, TipoMision  tipoMision) {
        super(nombre, capacidadTripulacion, anioDeLanzamiento);
        this.tipoMision =  tipoMision;
  ;  }

    @Override
    public String toString() {
        return "[Nombre: " + this.nombre + " - Capacidad Tripulacion: " + this.capacidadTripulacion + " - Modelo: " + this.anioDeLanzamiento + " - Tipo Mision: " + this.tipoMision.toString() + "]";
    }

    @Override
    public String iniciarExploracion(){
        return "Iniciando exploracion para nave... " + this;
    }
}
