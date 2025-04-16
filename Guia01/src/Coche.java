/*
o Crea una clase Coche con atributos marca, modelo, kilometraje, y combustibleRestante (en litros).
o Escribe un metodo para calcular cuántos kilómetros puede recorrer el coche con el combustible restante, considerando un consumo fijo de combustible por kilómetro.
o Implementa un metodo para "recargar" el combustible del coche. */

public class Coche {
    public static final double CONSUMO_COMBUSTIBLE_LITROS_POR_KILOMETRO = 9;
    private String marca;
    private String modelo;
    private int kilometraje;
    private int combustibleRestante;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public int getCombustibleRestante() {
        return combustibleRestante;
    }

    public Coche(String marca, String modelo, int combustible){
        this.kilometraje = 0;
        this.setMarca(marca);
        this.setModelo(modelo);
        this.RecargarCombustible(combustible);
    }

    public void RecargarCombustible(int combustible) {
        this.combustibleRestante = combustible;
    }

    public double CalcularAutonomiaKM(){
        double autonomia = this.getCombustibleRestante() / CONSUMO_COMBUSTIBLE_LITROS_POR_KILOMETRO;
        this.kilometraje += autonomia;
        this.combustibleRestante = 0;

        return autonomia;
    }
}
