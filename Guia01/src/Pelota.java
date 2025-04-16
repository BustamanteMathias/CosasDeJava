/**
 * o Define una clase Pelota con atributos marca y circunferencia.
 * o Implementa un metodo para comparar si dos pelotas tienen la misma circunferencia.
 * o Crea un metodo que permita inflar la pelota, aumentando su circunferencia en un valor dado.
 */

public class Pelota {
    private String marca;
    private double circunferencia;

    public Pelota(String marca, double circunferencia) {
        this.circunferencia = circunferencia;
        this.marca = marca;
    }

    public boolean CompararCircunferencia(Pelota p){
        return this.circunferencia == p.circunferencia;
    }

    public void Inflar(double i){
        this.circunferencia += i;
    }
}
