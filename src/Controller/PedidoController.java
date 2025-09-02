// controller/PedidoController.java
package Controller;

import Model.Pedido;
import Model.Producto;
import View.CarritoView;

public class PedidoController {
    private Pedido pedido;
    private CarritoView vista;

    public PedidoController(Pedido pedido, CarritoView vista) {
        this.pedido = pedido;
        this.vista = vista;
    }

    public void agregarProducto(Producto p) { pedido.agregarProducto(p); }
    public void eliminarProducto(Producto p) { pedido.eliminarProducto(p); }
    public void mostrarCarrito() { vista.mostrarCarrito(pedido); }
}
