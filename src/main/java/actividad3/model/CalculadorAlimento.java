package actividad3.model;

public class CalculadorAlimento extends CalculadorDePrecios{

    public static final double IMPUESTOS_ALIMENTO = 0.05;
    public static final int PRECIO_MIN_DESCUENTO = 100;
    public static final int PRECIO_MIN_ENVIO_GRATIS = 200;
    public static final double DESCUENTO_ALIMENTO = 0.15;

    @Override
    double calcularDescuento(double precioProducto) {
        return (precioProducto > PRECIO_MIN_DESCUENTO) ? DESCUENTO_ALIMENTO : 0.0;
    }

    @Override
    double calcularImpuesto(double precioProducto) {
        return IMPUESTOS_ALIMENTO;
    }

    @Override
    boolean esEnvioGratis(double precioProducto) {
        return precioProducto > PRECIO_MIN_ENVIO_GRATIS;
    }
}
