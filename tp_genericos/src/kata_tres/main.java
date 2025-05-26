package kata_tres;

import kata_dos.Productos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {

    public static void main(String[] args) {

        // Crear productos
        Productos<String> p1 = new Productos<>("P1", "Notebook", 150000.0);
        Productos<Integer> p2 = new Productos<>(102, "Tablet", 60000.0);
        Productos<String> p3 = new Productos<>("P3", "Teclado", 5000.0);

        // Crear pedidos
        Pedido pedido1 = new Pedido(1, LocalDate.of(2024, 5, 20));
        pedido1.agregarProducto(p1);

        Pedido pedido2 = new Pedido(2, LocalDate.of(2024, 4, 15));
        pedido2.agregarProducto(p2);
        pedido2.agregarProducto(p3);

        Pedido pedido3 = new Pedido(3, LocalDate.of(2024, 6, 10));
        pedido3.agregarProducto(p3);

        // Lista de pedidos
        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);

        // Ordenar por total
        Collections.sort(pedidos);
        System.out.println("Pedidos ordenados por total:");
        for (Pedido p : pedidos) {
            System.out.println(p);
        }

        // Ordenar por fecha
        pedidos.sort(new ComparadorPedidosPorFecha());
        System.out.println("\nPedidos ordenados por fecha:");
        for (Pedido p : pedidos) {
            System.out.println(p);
        }
    }
}

