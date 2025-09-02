package Model;

// Modelo Pedido
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void eliminarProducto(Producto p) {
        productos.remove(p);
    }

    public List<Producto> getProductos() {
        return productos;
    }
}