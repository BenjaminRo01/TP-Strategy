package actividad1.model;

public class CorreoArgentino implements StrategyEnvio{

    public static final int COEFICIENTE_POR_DISTANCIA = 5;

    @Override
    public double calcularEnvio(String destino, double peso, int distancia) {
        double montoFijo = 0.0;
        if(destino.equalsIgnoreCase("capital federal")){
            montoFijo = 500.0;
        }
        else{
            montoFijo = 800;
        }
        return montoFijo + this.costoPorDistancia(distancia);
    }
    private double costoPorDistancia(int distancia){
        return distancia * COEFICIENTE_POR_DISTANCIA;
    }
}
