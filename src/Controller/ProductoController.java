// controller/ProductoController.java
package Controller;

import Model.Producto;
import View.ProductoView;

public class ProductoController {
    private Producto Modelo;
    private ProductoView vista;

    public ProductoController(Producto Modelo, ProductoView vista) {
        this.Modelo = Modelo;
        this.vista = vista;
    }

    public void mostrarProducto() {
        vista.mostrarProducto(Modelo);
    }
}
