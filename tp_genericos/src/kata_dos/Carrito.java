package kata_dos;

import java.util.ArrayList;
import java.util.List;

public class Carrito<T extends Productos<?>>{

    private List<T> productos;

    public Carrito() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(T producto){
        productos.add(producto);
    }

    public void eliminarProducto(T producto){
        productos.remove(producto);
    }

    public double obtenerTotal(){
        double total = 0.0;
        for (T producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public void mostrarProductos() {
        for (T producto : productos) {
            System.out.println(producto);
        }
    }
}
