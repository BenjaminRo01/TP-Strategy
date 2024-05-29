package actividad3.model;

abstract class CalculadorDePrecios {
    public double calcularPrecio(double precioProducto){
        return precioProducto * (1 + calcularImpuesto(precioProducto)) * (1 - calcularDescuento(precioProducto)) - calcularEnvioGratis(precioProducto);
    }
    abstract double calcularDescuento(double precioProducto);
    abstract double calcularImpuesto(double precioProducto);
    abstract boolean esEnvioGratis(double precioProducto);
    private double calcularEnvioGratis(double precioProducto){
        return esEnvioGratis(precioProducto) ? 10.0 : 0.0;
    }
}
