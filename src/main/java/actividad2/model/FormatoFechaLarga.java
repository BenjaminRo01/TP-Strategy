package actividad2.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class FormatoFechaLarga implements StrategyFormatoFecha{
    @Override
    public String formateoFecha(LocalDate fecha) {
        int dia = fecha.getDayOfMonth();
        String mes = fecha.getMonth().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("es"));
        mes = mes.substring(0, 1).toUpperCase() + mes.substring(1);
        int anio = fecha.getYear();
        return String.format("%d de %s de %d", dia, mes, anio);
    }
}
