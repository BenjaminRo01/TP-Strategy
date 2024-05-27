package actividad3.model;

public class CalculadorAlimento implements CalculadorDePrecios{

    public static final double IMPUESTOS_ALIMENTO = 0.05;
    public static final int PRECIO_MIN_DESCUENTO = 100;
    public static final int PRECIO_MIN_ENVIO_GRATIS = 200;
    public static final double DESCUENTO_ALIMENTO = 0.15;
    public static final int DESCUENTO_ENVIO_GRATIS = 10;

    @Override
    public double calcularPrecio(double precioProducto) {
        double descuentos = 0.0;
        boolean envioGratis = false;
        double total = 0.0;

        if(precioProducto > PRECIO_MIN_DESCUENTO) {
            descuentos = DESCUENTO_ALIMENTO;
        }
        if(precioProducto > PRECIO_MIN_ENVIO_GRATIS) {
            envioGratis = true;
        }
        total = precioProducto * (1 + IMPUESTOS_ALIMENTO) * (1 - descuentos);
        if (envioGratis) {
            total -= DESCUENTO_ENVIO_GRATIS;
        }
        return total;
    }
}
