
package herenciaactividad;
public class HerenciaActividad {
    public static void main(String[] args) {
        //productos
        Electronico PcGamer = new Electronico("E001", "PC GAMER", 1000000, "Razer", 12);
        Ropa Poleron = new Ropa("R001", "Poleron Azul", 50000, "XL", "Azul");
        //Cliente
        Cliente cliente = new Cliente("C001", "Juan Pérez");
        Pedido pedido = new Pedido();
        pedido.agregarProducto(PcGamer);
        pedido.agregarProducto(Poleron);
        cliente.agregarPedido(pedido);
        cliente.mostrarPedidos();
    }
    
}
