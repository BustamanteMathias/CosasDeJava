package Entidades;

public class CruceroEstelar extends Nave{
    private int cantidadPasajeros;

    public CruceroEstelar(String nombre, int capacidadTripulacion, int anioDeLanzamiento, int cantidadPasajeros) {
        super(nombre, capacidadTripulacion, anioDeLanzamiento);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public String toString() {
        return "[Nombre: " + this.nombre + " - Capacidad Tripulacion: " + this.capacidadTripulacion + " - Modelo: " + this.anioDeLanzamiento + " - Cantidad de Pasajeros: " + this.cantidadPasajeros + "]";
    }

    @Override
    public String iniciarExploracion(){
        return "[EL CARGUERO] " + this + " no puede iniciar una mision estelar";
    }
}
