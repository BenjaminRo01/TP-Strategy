import actividad2.model.FormatoFechaCorta;
import actividad2.model.FormatoFechaLarga;
import actividad2.model.Persona;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class TestFomateoFecha {
    @Test
    public void testFechaCorta(){
        var persona = new Persona(LocalDate.of(1986,6,3), new FormatoFechaCorta());
        var resultado = persona.obtenerFechaNacimiento();
        Assertions.assertEquals("3-06-1986", resultado);
    }
    @Test
    public void testFechaLarga(){
        var persona = new Persona(LocalDate.of(1986,6,3), new FormatoFechaLarga());
        var resultado = persona.obtenerFechaNacimiento();
        Assertions.assertEquals("3 de Junio de 1986", resultado);
    }
}
