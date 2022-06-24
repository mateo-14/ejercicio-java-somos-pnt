package com.mateoledesma;

public class CuidadoPersonaLiquido extends ProductoLiquido {
    public CuidadoPersonaLiquido(String nombre, double precio, double litros) {
        super(nombre, precio, litros);
    }

    @Override
    public String toString() {
        return super.toString() + " /// Contenido: " + (this.litros * 1000) + "ml";
    }
}
