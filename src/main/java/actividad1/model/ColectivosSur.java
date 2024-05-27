package actividad1.model;

public class ColectivosSur implements StrategyEnvio{
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
        if (peso > 30.0){
            costo += 2000.0;
        } else if (peso > 5.0) {
            costo += 500.0;
        }
        return costo;
    }
}
