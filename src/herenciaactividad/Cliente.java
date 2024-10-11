package herenciaactividad;
import java.util.ArrayList;
public class Cliente {
    //atributos
    private String idCliente;
    private String nombre;
    private ArrayList<Pedido> pedidosRealizados;
    
    //constructor
    public Cliente(String idCliente, String nombre) {
        this.idCliente = idCliente; // Inicializa el idCliente
        this.nombre = nombre; // Inicializa el nombre del cliente
        this.pedidosRealizados = new ArrayList<>(); // Inicializa la lista de pedidos
    }
    
    //metodos
    public void agregarPedido(Pedido pedido) {
        pedidosRealizados.add(pedido); // Añade el pedido a la lista
    }

    public void mostrarPedidos() {
        System.out.println("Cliente: " + nombre);
        for (Pedido pedido : pedidosRealizados) {
            pedido.mostrarInfo(); // Llama al método mostrarInfo() de cada pedido
        }
    }
}
