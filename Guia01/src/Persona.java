/*
o Desarrolla una clase Persona con los atributos nombre, edad, y altura (en metros).
o Implementa un metodo esMayorDeEdad() que devuelva true si la persona es mayor de 18 años.
o Agrega un metodo para calcular el índice de masa corporal (IMC) de la persona, dado su peso.
 */

public class Persona {
    private String nombre;
    private int edad;
    private double altura;

    public String GetNombre() {
        return this.nombre;
    }

    public int GetEdad() {
        return this.edad;
    }

    public double GetAltura() {
        return this.altura;
    }

    public void SetNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean SetEdad(int edad) {
        if(edad > 0){
            this.edad = edad;
            return true;
        }
        return false;
    }

    public boolean SetAltura(double altura) {
        if(altura > 0){
            this.altura = altura;
            return true;
        }
        return false;
    }

    public boolean EsMayorDeEdad(){
        return this.edad > 17;
    }

        public String CalcularIMC(double peso){
        // FORMULA GOOGLEADA PORQUE JAMAS EN LA VIDA SUPE QUE EXISTIA ESTO: IMC = Peso kg/ (Altura mts) ** 2
        /*
        IMC         Clasificación
        Menor  18.5 Bajo peso
        18.5 – 24.9	Peso normal
        25.0 – 29.9	Sobrepeso
        30.0 – 34.9	Obesidad grado 1
        35.0 – 39.9	Obesidad grado 2
        40.0 o más	Obesidad grado 3 (mórbida)*/
            if(peso > 0){
                double IMC = peso / Math.pow(this.GetAltura(), 2);

                if(IMC < 18.5){
                    return String.format("Bajo Peso - IPM: %.2f", IMC);
                } else if(IMC < 24.9){
                    return String.format("Peso normal - IPM: %.2f", IMC);
                } else if(IMC < 29.9){
                    return String.format("Sobrepeso - IPM: %.2f", IMC);
                } else if(IMC < 34.9){
                    return String.format("Obesidad grado 1 - IPM: %.2f", IMC);
                } else if(IMC < 39.9){
                    return String.format("Obesidad grado 2 - IPM: %.2f", IMC);
                } else {
                    return String.format("Obesidad grado 3 (morbida)- IPM: %.2f", IMC);
                }
            }

        return "[ERROR] Argumento Peso Invalido.";
    }
}
