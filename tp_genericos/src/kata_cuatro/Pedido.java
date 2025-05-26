package kata_cuatro;

import kata_dos.Productos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Comparable<Pedido>, Identificable<Integer> {
    private int id;
    private List<Productos<?>> productos;
    private LocalDate fecha;

    public Pedido(int id, LocalDate fecha) {
        this.id = id;
        this.fecha = fecha;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Productos<?> producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Productos<?> p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public int compareTo(Pedido otro) {
        return Double.compare(this.calcularTotal(), otro.calcularTotal());
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", total=" + calcularTotal() +
                ", fecha=" + fecha +
                '}';
    }

    // Implementación de Identificable<Integer>
    @Override
    public Integer getID() {
        return id;
    }

    @Override
    public boolean tieneMismoID(Integer id) {
        return this.id == id;
    }
}

