// controller/DescuentoController.java
package Controller;

import Decorator.Component;
import Model.DiscountManager;
import Model.Producto;
import View.DescuentoView;

public class DescuentoController {
    private DiscountManager discountManager;
    private DescuentoView vista;

    public DescuentoController(DescuentoView vista) {
        this.discountManager = DiscountManager.getInstance();
        this.vista = vista;
    }

    public void aplicarDescuento(Producto p, Component descuento) {
        double precioFinal = discountManager.aplicarDescuento(descuento);
        vista.mostrarDescuento(p, precioFinal);
    }
}
