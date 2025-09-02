// decorator/DescuentoCategoria.java
package Decorator;

import Model.Producto;

public class DescuentoCategoria extends Decorator {
    private Producto producto;
    private String categoriaObjetivo;

    public DescuentoCategoria(Component componente, Producto producto, String categoriaObjetivo) {
        super(componente);
        this.producto = producto;
        this.categoriaObjetivo = categoriaObjetivo;
    }

    @Override
    public double getPrecio() {
        if (producto.getCategoria().equalsIgnoreCase(categoriaObjetivo)) {
            return super.getPrecio() * 0.80;
        }
        return super.getPrecio();
    }
}
