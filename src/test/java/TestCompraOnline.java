import model.CarritoCompra;
import model.ColectivosSur;
import model.CorreoArgentino;
import model.Producto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCompraOnline {
    @Test
    public void testColectivoSur(){
        var carritoCompra = new CarritoCompra(new ColectivosSur());
        carritoCompra.agregarProductos(new Producto("Notebook",700000.0, 3.0));
        carritoCompra.agregarProductos(new Producto("Estabilizador",120000.0, 7.0));

        var resultado = carritoCompra.calcularCostoTotal("Capital Federal", 10);
        Assertions.assertEquals(821500.0, resultado,821500.0);
    }
    @Test
    public void testCorreoArgentino(){
        var carritoCompra = new CarritoCompra(new CorreoArgentino());
        carritoCompra.agregarProductos(new Producto("Celular",360000.0, 0.7));
        carritoCompra.agregarProductos(new Producto("WebCam",100000.0, 0.5));
        carritoCompra.agregarProductos(new Producto("Microfono",150000.0, 2.0));

        var resultado = carritoCompra.calcularCostoTotal("Viedma", 500);
        Assertions.assertEquals(615800.0, resultado,615800.0);
    }
}
