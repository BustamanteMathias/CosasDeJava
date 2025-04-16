/**
 * o Diseña una clase Reloj con atributos hora, minuto, y segundo.
 * o Implementa métodos para ajustar la hora, minuto y segundo.
 * o Crea un metodo que permita avanzar el reloj un segundo, asegurando que los valores de hora, minuto y segundo se mantengan correctos.
 */

public class Reloj {
    public static final int HH_MAX = 24;
    public static final int MM_MAX = 60;
    public static final int SS_MAX = 60;

    private int hora;
    private int minuto;
    private int segundo;

    public Reloj(int hh, int mm, int ss) {
        this.hora = hh;
        this.minuto = mm;
        this.segundo = ss;
    }

    public boolean SetHora(int hh, int mm, int ss){
        if(hh>HH_MAX || mm>MM_MAX || ss>SS_MAX){
            if(hh<0 || mm<0 || ss<0){
                return false;
            }
        }

        this.hora = hh;
        this.minuto = mm;
        this.segundo = ss;

        return true;
    }

    public String Aumentar1Segundo(){
        this.segundo++;
        if(this.segundo == 60){
            this.segundo = 0;
            this.minuto++;
            if(this.minuto == 60){
                this.minuto = 0;
                this.hora++;
                if(this.hora == 24){
                    this.hora = 0;
                }
            }
        }

        return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }
}
