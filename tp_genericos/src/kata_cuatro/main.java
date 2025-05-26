package kata_cuatro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        // Crear pedidos
        Pedido p1 = new Pedido(1, LocalDate.of(2024, 3, 15));
        Pedido p2 = new Pedido(2, LocalDate.of(2024, 4, 10));
        Pedido p3 = new Pedido(3, LocalDate.of(2024, 5, 5));

        // Lista de pedidos
        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(p1);
        pedidos.add(p2);
        pedidos.add(p3);

        // Buscador genérico
        Buscador<Pedido, Integer> buscador = new Buscador<>();

        // Buscar pedido con ID 2
        Pedido encontrado = buscador.buscar(pedidos, 2);

        // Mostrar resultado
        if (encontrado != null) {
            System.out.println("Pedido encontrado: " + encontrado);
        } else {
            System.out.println("Pedido no encontrado.");
        }
    }
}

