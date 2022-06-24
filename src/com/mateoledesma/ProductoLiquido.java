package com.mateoledesma;

public class ProductoLiquido extends Producto {
    public ProductoLiquido(String nombre, double precio, double litros) {
        super(nombre, precio);
        this.litros = litros;
    }

    protected final double litros;
    public double getLitros() {
        return litros;
    }
}
