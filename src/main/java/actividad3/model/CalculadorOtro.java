package actividad3.model;

public class CalculadorOtro extends CalculadorDePrecios{

    public static final double IMPUESTOS_OTRO = 0.15;
    public static final int PRECIO_MIN_DESCUENTO = 50;
    public static final double DESCUENTO_OTRO = 0.05;
    public static final int PRECIO_MIN_ENVIO_GRATIS = 200;

    @Override
    double calcularDescuento(double precioProducto) {
        return (precioProducto > PRECIO_MIN_DESCUENTO) ? DESCUENTO_OTRO : 0.0;
    }

    @Override
    double calcularImpuesto(double precioProducto) {
        return IMPUESTOS_OTRO;
    }

    @Override
    boolean esEnvioGratis(double precioProducto) {
        return precioProducto > PRECIO_MIN_ENVIO_GRATIS;
    }

}
