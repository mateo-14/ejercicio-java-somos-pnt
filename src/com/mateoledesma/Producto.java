package com.mateoledesma;

public class Producto implements Comparable<Producto> {
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    protected final String nombre;

    public String getNombre() {
        return nombre;
    }

    protected final double precio;

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " /// Precio: $" + this.precio;
    }

    @Override
    public int compareTo(Producto o) {
        return Double.compare(getPrecio(), o.getPrecio());
    }
}
