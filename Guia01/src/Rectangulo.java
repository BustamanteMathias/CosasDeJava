/*
Clase Rectángulo:
o Crea una clase Rectángulo con atributos ancho y alto de tipo double.
o Implementa métodos para calcular el área y el perímetro del rectángulo.
o Escribe un metodo esCuadrado() que devuelva true si el rectángulo es un cuadrado, es decir, si
ancho y alto son iguales.
 */

public class Rectangulo {
    private double ancho;
    private double alto;

    public double GetAncho(){
        return this.ancho;
    }

    public double GetAlto(){
        return this.alto;
    }

    public boolean SetAncho(double buffer){
        if (buffer < 0){
            System.out.println("[ERROR] Set de campo negativo.");
            return false;
        }

        this.ancho = buffer;
        return true;
    }

    public boolean SetAlto(double buffer){
        if (buffer < 0){
            System.out.println("[ERROR] Set de campo negativo.");
            return false;
        }

        this.alto = buffer;
        return true;
    }

    public boolean EsCuadrado(){
        return this.GetAlto() == this.GetAncho();
    }

    public double GetArea(){
        return this.GetAncho() * this.GetAlto();
    }

    public double GetPerimetro(){
        return (this.GetAncho() * 2) + (this.GetAlto() * 2);
    }
}

