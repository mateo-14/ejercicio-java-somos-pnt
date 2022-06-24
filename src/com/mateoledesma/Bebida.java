package com.mateoledesma;

public class Bebida extends ProductoLiquido {
    public Bebida(String nombre, double precio, double litros) {
        super(nombre, precio, litros);
    }

    @Override
    public String toString() {
        return super.toString() + " /// Litros: " + this.litros;
    }
}
