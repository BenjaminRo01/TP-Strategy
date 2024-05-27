package actividad2.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatoFechaCorta implements StrategyFormatoFecha{
    @Override
    public String formateoFecha(LocalDate fecha) {
        return DateTimeFormatter.ofPattern("d-MM-yyyy").format(fecha);
    }
}
