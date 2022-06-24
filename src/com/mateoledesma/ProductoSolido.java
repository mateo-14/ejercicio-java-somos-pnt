package com.mateoledesma;

public class ProductoSolido extends Producto {

    public ProductoSolido(String nombre, double precio, double kilos) {
        super(nombre, precio);
        this.kilos = kilos;
    }

    private final double kilos;
    public double getKilos() {
        return kilos;
    }

    @Override
    public String toString() {
        return super.toString() + " /// Unidad de venta: kilo";
    }
}
