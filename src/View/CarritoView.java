
package View;

import Model.Pedido;
import Model.Producto;

public class CarritoView {
    public void mostrarCarrito(Pedido pedido) {
        System.out.println("Carrito de compras:");
        for (Producto p : pedido.getProductos()) {
            System.out.println("- " + p.getNombre() + " $" + p.getPrecio());
        }
    }
}
