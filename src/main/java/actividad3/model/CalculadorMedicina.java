package actividad3.model;

public class CalculadorMedicina extends CalculadorDePrecios{

    public static final double IMPUESTOS_MEDICINA = 0.0;
    public static final int PRECIO_MIN_DESCUENTO = 50;
    public static final double DESCUENTO_MEDICINA = 0.1;
    public static final int PRECIO_MIN_ENVIO_GRATIS = 100;

    @Override
    double calcularDescuento(double precioProducto) {
        return (precioProducto > PRECIO_MIN_DESCUENTO) ? DESCUENTO_MEDICINA : 0.0;
    }

    @Override
    double calcularImpuesto(double precioProducto) {
        return IMPUESTOS_MEDICINA;
    }

    @Override
    boolean esEnvioGratis(double precioProducto) {
        return precioProducto > PRECIO_MIN_ENVIO_GRATIS;
    }
}
