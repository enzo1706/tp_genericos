package kata_uno;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<Productos<?>> productos = new ArrayList<>();

        productos.add(new Productos<String>("A00001 ", "Mesa ", 10000));
        productos.add(new Productos<Integer>(2, "Silla ", 5000));
        productos.add(new Productos<String>("A00003 ", "Armario ", 2000));
        productos.add(new Productos<Integer>(4, "Estanteria ", 3000));

        for (Productos p : productos){
            System.out.println(p);
        }
    }
}
