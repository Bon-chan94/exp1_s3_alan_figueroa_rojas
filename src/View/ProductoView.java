package View;


import Model.Producto;

public class ProductoView {
    public void mostrarProducto(Producto p ) {
        System.out.println("Producto: " + p.getNombre() +
                " | Precio: $" + p.getPrecio() +
                " | Categoría: " + p.getCategoria());
    }
}
