/*
o Define una clase Círculo con un atributo radio de tipo double.
o Crea métodos para calcular el área y la circunferencia del círculo.
o Implementa un metodo para escalar el círculo, aumentando o disminuyendo su radio en un
porcentaje dado.
 */
public class Circulo {
    private double radio;

    public double GetRadio(){
        return this.radio;
    }

    public boolean SetRadio(double buffer){
        if(buffer < 0){
            System.out.println("[ERROR] Set negativo.");
            return false;
        }
        this.radio = buffer;
        return true;
    }

    public double GetArea(){
        return Math.PI * Math.pow(this.GetRadio(), 2);
    }

    public double GetPerimetro(){
        return this.GetRadio() * (Math.PI * 2);
    }

    public double ModifierRadio(double value){
        double aux = this.GetRadio() * (value / 100);
        this.SetRadio(this.GetRadio() + aux);

        return this.GetRadio();
    }
}
