package actividad3.model;

public class CalculadorLibro extends CalculadorDePrecios{

    public static final double DESCUENTO_LIBRO = 0.1;
    public static final double IMPUESTOS_LIBRO = 0.1;
    public static final int PRECIO_MIN_ENVIO_GRATIS = 100;

    @Override
    double calcularDescuento(double precioProducto) {
        return DESCUENTO_LIBRO;
    }

    @Override
    double calcularImpuesto(double precioProducto) {
        return IMPUESTOS_LIBRO;
    }

    @Override
    boolean esEnvioGratis(double precioProducto) {
        return precioProducto > PRECIO_MIN_ENVIO_GRATIS;
    }
}
