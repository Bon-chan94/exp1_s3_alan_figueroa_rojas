// decorator/ProductoBase.java
package Decorator;

import Decorator.Component;
import Model.Producto;

public class ProductoBase implements Component {
    private Producto producto;

    public ProductoBase(Producto producto) {
        this.producto = producto;
    }

    @Override
    public double getPrecio() {
        return producto.getPrecio();
    }
}
