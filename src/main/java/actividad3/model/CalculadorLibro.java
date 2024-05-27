package actividad3.model;

public class CalculadorLibro implements CalculadorDePrecios{

    public static final double DESCUENTO_LIBRO = 0.1;
    public static final double IMPUESTOS_LIBRO = 0.1;
    public static final int DESCUENTO_ENVIO_GRATIS = 10;
    public static final int PRECIO_MIN_ENVIO_GRATIS = 100;

    @Override
    public double calcularPrecio(double precioProducto) {
        boolean envioGratis = false;
        double total = 0.0;

        if(precioProducto > PRECIO_MIN_ENVIO_GRATIS) {
            envioGratis = true;
        }
        total = precioProducto * (1 + IMPUESTOS_LIBRO) * (1 - DESCUENTO_LIBRO);
        if (envioGratis) {
            total -= DESCUENTO_ENVIO_GRATIS;
        }

        return total;
    }
}
