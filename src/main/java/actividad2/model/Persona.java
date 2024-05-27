package actividad2.model;

import java.time.LocalDate;

public class Persona {
    private LocalDate fechaNacimiento;
    private StrategyFormatoFecha strategyFormatoFecha;

    public Persona(LocalDate fechaNacimiento, StrategyFormatoFecha strategyFormatoFecha) {
        this.fechaNacimiento = fechaNacimiento;
        this.strategyFormatoFecha = strategyFormatoFecha;
    }
    public String obtenerFechaNacimiento(){
        return this.strategyFormatoFecha.formateoFecha(this.fechaNacimiento);
    }
}
