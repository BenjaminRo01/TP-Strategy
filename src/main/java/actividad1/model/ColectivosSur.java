package actividad1.model;

public class ColectivosSur implements StrategyEnvio{

    public static final double PESO_MAX = 30.0;
    public static final double PESO_MIN = 5.0;
    public static final double COSTO_POR_PESO_MAX = 2000.0;
    public static final double COSTO_POR_PESO_MIN = 500.0;

    @Override
    public double calcularEnvio(String destino, double peso, int distancia) {
        double montoFijo = 0.0;
        if(destino.equalsIgnoreCase("capital federal")){
            montoFijo = 1000.0;
        } else if (destino.equalsIgnoreCase("gran buenos aires")) {
            montoFijo = 1500.0;
        }
        else {
            montoFijo = 3000.0;
        }
        return montoFijo + this.costoPorPeso(peso);
    }
    private double costoPorPeso(double peso){
        double costo = 0.0;
        if (peso > PESO_MAX){
            costo += COSTO_POR_PESO_MAX;
        } else if (peso > PESO_MIN) {
            costo += COSTO_POR_PESO_MIN;
        }
        return costo;
    }
}
