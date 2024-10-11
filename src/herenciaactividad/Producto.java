
package herenciaactividad;
public class Producto {
    private String idProducto;
    private String nombre;
    private double precio;
    
    //constructor
    public Producto(String idProducto, String nombre, double precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    //metodos
    public void mostrarInfo() {
        System.out.println("ID Producto: " + idProducto);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
    }
    
    public double calcularDescuento(double descuento){
        return precio - (precio*descuento);//para precio post decuento
    }
}
