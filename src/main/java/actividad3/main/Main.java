package actividad3.main;

import actividad3.model.*;

public class Main {
    public static void main(String[] args) {
        var libro = new Producto(TipoProducto.LIBRO,30.0);
        var alimento = new Producto(TipoProducto.ALIMENTO,330.0);
        var medicina = new Producto(TipoProducto.MEDICINA, 130.0);
        var otro = new Producto(TipoProducto.OTRO,130.0);
        System.out.println(libro.precioFinal());
        System.out.println(alimento.precioFinal());
        System.out.println(medicina.precioFinal());
        System.out.println(otro.precioFinal());
    }
}
