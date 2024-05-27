package model;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompra {
    private List<Producto> productos;
    private StrategyEnvio strategyEnvio;
    public CarritoCompra(StrategyEnvio strategyEnvio){
        this.productos = new ArrayList<>();
        this.strategyEnvio = strategyEnvio;
    }
    public void agregarProductos(Producto producto){
        this.productos.add(producto);
    }
    public double calcularCostoTotal(String destino, int distancia){
        double costoPorProducto = this.calcularCostoPorProducto();
        double costoEnvio = strategyEnvio.calcularEnvio(destino, this.calcularPesoTotal(),distancia);
        return costoPorProducto + costoEnvio;
    }
    private double calcularCostoPorProducto() {
        return this.productos.stream().mapToDouble(Producto::precio).sum();
    }
    private double calcularPesoTotal(){
        return this.productos.stream().mapToDouble(Producto::peso).sum();
    }
}
