package com.mateoledesma;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Producto[] productos = new Producto[]{
                new Bebida("Coca-Cola Zero", 20, 1.5),
                new Bebida("Coca-Cola", 18, 1.5),
                new CuidadoPersonaLiquido("Shampoo Sedal", 19, 0.5),
                new ProductoSolido("Frutillas", 64, 1)
        };

        for (Producto producto : productos) {
            System.out.println(producto);
        }

        Arrays.sort(productos);
        Producto masBarato = productos[0];
        Producto masCaro = productos[productos.length - 1];

        System.out.println("=============================");
        System.out.println("Producto más caro: " + masCaro.getNombre());
        System.out.println("Producto más barato: " + masBarato.getNombre());

    }
}
