import Command.AgregarProductoCommand;
import Command.EliminarProductoCommand;
import Command.Command;
import Controller.DescuentoController;
import Controller.PedidoController;
import Controller.ProductoController;
import Decorator.Component;
import Decorator.ProductoBase;
import Decorator.Descuento10;
import Decorator.DescuentoCategoria;
import Model.Pedido;
import Model.Producto;
import View.CarritoView;
import View.DescuentoView;
import View.ProductoView;

public class Main {
    public static void main(String[] args) {
        // Crear productos
        Producto camisa = new Producto("Camisa", 20000, "Ropa");
        Producto pantalon = new Producto("Pantalón", 30000, "Ropa");
        Producto gorro = new Producto("Gorro", 15000, "Accesorio");

        // Crear vistas
        ProductoView productoView = new ProductoView();
        CarritoView carritoView = new CarritoView();
        DescuentoView descuentoView = new DescuentoView();

        // Controladores
        ProductoController productoController = new ProductoController(camisa, productoView);
        Pedido pedido = new Pedido();
        PedidoController pedidoController = new PedidoController(pedido, carritoView);
        DescuentoController descuentoController = new DescuentoController(descuentoView);

        // Mostrar producto
        productoController.mostrarProducto();

        // Usar comandos
        Command agregarCamisa = new AgregarProductoCommand(pedido, camisa);
        Command agregarPantalon = new AgregarProductoCommand(pedido, pantalon);
        agregarCamisa.ejecutar();
        agregarPantalon.ejecutar();

        pedidoController.mostrarCarrito();

        // Aplicar descuento del 10%
        Component prodBase = new ProductoBase(camisa);
        Component desc10 = new Descuento10(prodBase);
        descuentoController.aplicarDescuento(camisa, desc10);

        // Aplicar descuento por categoría
        Component descCategoria = new DescuentoCategoria(new ProductoBase(gorro), gorro, "Accesorio");
        descuentoController.aplicarDescuento(gorro, descCategoria);
    }
}
