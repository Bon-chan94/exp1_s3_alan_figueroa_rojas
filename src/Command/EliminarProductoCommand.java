// command/EliminarProductoCommand.java
package Command;

import Model.Pedido;
import Model.Producto;

public class EliminarProductoCommand implements Command {
    private Pedido pedido;
    private Producto producto;

    public EliminarProductoCommand(Pedido pedido, Producto producto) {
        this.pedido = pedido;
        this.producto = producto;
    }

    @Override
    public void ejecutar() {
        pedido.eliminarProducto(producto);
        System.out.println(producto.getNombre() + " eliminado del carrito.");
    }
}
