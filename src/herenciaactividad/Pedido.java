package herenciaactividad;
import java.util.ArrayList;
public class Pedido {
    //atributos
    private ArrayList<Producto> productos;
    private double total;
    
    //constructor
    public Pedido() {
        this.productos = new ArrayList<>(); // Inicializa la lista de productos
        this.total = 0; // Inicializa el total a 0
    }
    
    
    //metodos
    public void agregarProducto(Producto producto) {
        productos.add(producto); // Añade el producto a la lista
        total += producto.calcularDescuento(0); // Actualiza el total
    }
    
    public double calcularTotal() {
        return total; // Devuelve el total del pedido
    }
    
    public void mostrarInfo() {
        System.out.println("Productos en el pedido:");
        for (Producto producto : productos) {
            producto.mostrarInfo(); // Llama al método mostrarInfo() de cada producto
        }
        System.out.println("Total del pedido: " + total);
    }
    
}