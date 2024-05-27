package actividad3.main;

import actividad3.model.*;

public class Main {
    public static void main(String[] args) {
        var libro = new Producto(30.0, new CalculadorLibro());
        var alimento = new Producto(330.0, new CalculadorAlimento());
        var medicina = new Producto( 130.0, new CalculadorMedicina());
        var otro = new Producto(130.0, new CalculadorOtro());
        System.out.println(libro.precioFinal());
        System.out.println(alimento.precioFinal());
        System.out.println(medicina.precioFinal());
        System.out.println(otro.precioFinal());
    }
}
