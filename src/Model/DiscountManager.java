
package Model;

import Decorator.Component;

public class DiscountManager {
    private static DiscountManager instance;

    private DiscountManager() {} // Constructor privado

    public static DiscountManager getInstance() {
        if (instance == null) {
            instance = new DiscountManager();
        }
        return instance;
    }

    public double aplicarDescuento(Component descuento) {
        return descuento.getPrecio();
    }
}
