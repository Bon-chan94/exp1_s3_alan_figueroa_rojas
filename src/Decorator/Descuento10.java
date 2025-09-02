// decorator/Descuento10.java
package Decorator;

public class Descuento10 extends Decorator {
    public Descuento10(Component componente) {
        super(componente);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() * 0.90;
    }
}
