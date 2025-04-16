/**
 * o Desarrolla una clase Producto con atributos nombre, precio, y cantidadEnStock.
 * o Crea un metodo para aplicar un descuento al precio del producto.
 * o Implementa un metodo para realizar una venta, actualizando la cantidad en stock y verificando
 * que haya suficiente stock disponible.
 */

public class Producto {
    private String nombre;

    public double getPrecio() {
        return precio;
    }

    private double precio;
    private int cantidadEnStock;

    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    public boolean SetDescuento(double descuento){
        if(descuento > 100 || descuento < 0){
            return false;
        }

        this.precio = this.precio - (this.precio * (descuento / 100));
        return true;
    }

    public boolean VenderProducto(int cantidad){
        if(cantidad > this.cantidadEnStock){
            return false;
        }

        this.cantidadEnStock -= cantidad;

        return true;
    }
}
