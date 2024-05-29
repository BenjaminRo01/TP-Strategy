package actividad3.model;

import java.util.HashMap;
import java.util.Map;

public class Producto {
    private double precio;
    private TipoProducto tipoProducto;
    private Map<String, CalculadorDePrecios> calculadorasDePrecios;
    public Producto(TipoProducto tipoProducto, double precio) {
        this.precio = precio;
        this.tipoProducto = tipoProducto;
        this.calculadorasDePrecios.put(TipoProducto.ALIMENTO.name(), new CalculadorAlimento());
        this.calculadorasDePrecios.put(TipoProducto.MEDICINA.name(), new CalculadorMedicina());
        this.calculadorasDePrecios.put(TipoProducto.LIBRO.name(), new CalculadorLibro());
        this.calculadorasDePrecios.put(TipoProducto.OTRO.name(), new CalculadorOtro());
    }
    public double precioFinal() {
        return this.calculadorasDePrecios.get(this.tipoProducto.name()).calcularPrecio(this.precio);
    }
}
