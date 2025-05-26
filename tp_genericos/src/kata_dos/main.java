package kata_dos;

public class main {
    public static void main(String[] args) {

        Productos<String> p1 =  new Productos<>("105 ", "computadora ", 500000);
        Productos<Integer> p2 = new Productos<>(106 , "Iphone 16 ", 100000);
        Productos<String> p3 = new Productos<>("107 ", "Auriculares ", 20000);

        Carrito<Productos<?>> carrito = new Carrito<>();

        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);
        carrito.agregarProducto(p3);

        System.out.println("-----Productos en el carrito-----");
        carrito.mostrarProductos();

        System.out.printf("Total del carrito: $%.2f%n", carrito.obtenerTotal());


    }
}
