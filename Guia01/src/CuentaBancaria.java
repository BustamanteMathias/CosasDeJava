/*
o Define una clase CuentaBancaria con atributos saldo, titular, y numeroDeCuenta.
o Implementa métodos para depositar y retirar dinero, asegurándote de que no se permita retirar más de lo que hay en el saldo.
o Crea un metodo para consultar el saldo actual de la cuenta.
 */

public class CuentaBancaria {
    private double saldo;
    private String titular;
    private long numeroDeCuenta;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if(!titular.isEmpty()){
            this.titular = titular;
        }
    }

    public long getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(long numeroDeCuenta) {
        if(numeroDeCuenta > 1000000000000L){
            this.numeroDeCuenta = numeroDeCuenta;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean Deposiar(double value){
        if(value > 0){
            this.setSaldo(this.saldo + value); // this.saldo += value
            return true;
        }
        return false;
    }

    public boolean Retirar(double value){
        if(value > 0 && value < this.getSaldo()){
            this.setSaldo(this.saldo - value);
            return true;
        }
        return false;
    }

    public double ConsultarSaldo(){
        return this.getSaldo();
    }
}
