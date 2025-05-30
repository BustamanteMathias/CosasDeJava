package Entidades;

import java.util.Comparator;

public class Carguero extends Nave {
    private  int capacidadCarga;

    public Carguero(String nombre, int capacidadTripulacion, int anioDeLanzamiento, int capacidadCarga) {
        super(nombre, capacidadTripulacion, anioDeLanzamiento);
        this.setCapacidadCarga(capacidadCarga);
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        if (capacidadCarga < 100) { capacidadCarga = 100; }
        if (capacidadCarga <= 500){
            this.capacidadCarga = capacidadCarga;
        }
        System.out.println("[ERROR] Exceso de carga. 500 toneladas MAXIMO.");
    }

    @Override
    public String toString() {
        return "[Nombre: " + this.nombre + " - Capacidad Tripulacion: " + this.capacidadTripulacion + " - Modelo: " + this.anioDeLanzamiento + " - Capacidad de carga: " + this.capacidadCarga + "]";
    }

    @Override
    public String iniciarExploracion(){
        return "Iniciando exploracion para nave... " + this;
    }
}
