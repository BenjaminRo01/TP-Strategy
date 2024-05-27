package actividad3.model;

public class CalculadorMedicina implements CalculadorDePrecios{

    public static final double IMPUESTOS_MEDICINA = 0.0;
    public static final int PRECIO_MIN_DESCUENTO = 50;
    public static final double DESCUENTO_MEDICINA = 0.1;
    public static final int PRECIO_MIN_ENVIO_GRATIS = 100;
    public static final int DESCUENTO_ENVIO_GRATIS = 10;

    @Override
    public double calcularPrecio(double precioProducto) {
        double descuentos = 0.0;
        boolean envioGratis = false;
        double total = 0.0;

        if (precioProducto > PRECIO_MIN_DESCUENTO) {
            descuentos = DESCUENTO_MEDICINA;
        }
        if (precioProducto > PRECIO_MIN_ENVIO_GRATIS) {
            envioGratis = true;
        }
        total = precioProducto * (1 + IMPUESTOS_MEDICINA) * (1 - descuentos);
        if (envioGratis) {
            total -= DESCUENTO_ENVIO_GRATIS;
        }

        return total;
    }
}
