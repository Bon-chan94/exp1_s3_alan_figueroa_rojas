// view/DescuentoView.java
package View;

import Model.Producto;

public class DescuentoView {
    public void mostrarDescuento(Producto p, double precioConDescuento) {
        System.out.println("Producto: " + p.getNombre() +
                " | Precio con descuento: $" + precioConDescuento);
    }
}
