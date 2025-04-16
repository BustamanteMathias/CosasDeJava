/**
 * o Crea una clase Termómetro con un atributo temperatura de tipo double.
 * o Escribe métodos para convertir la temperatura de grados Celsius a Fahrenheit y viceversa.
 * o Implementa un metodo que permita aumentar o disminuir la temperatura en un valor dado.
 */

public class Termometro {
    private double temperatura;

    public Termometro(double temp){
        this.temperatura = temp;
    }

    public void setTemperatura(double temp) {
        this.temperatura = temp;
    }

    public double GetTempCelsius(){
        return (this.temperatura - 32) * 5/9;
    }

    public double GetTempFahrenheit(){
        return (this.temperatura * 9/5) + 32;
    }
}
