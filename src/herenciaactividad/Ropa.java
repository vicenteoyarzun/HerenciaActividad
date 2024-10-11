
package herenciaactividad;

public class Ropa extends Producto {
   //atributos
    private String talla;
    private String color;
    
    //constructor
    public Ropa(String idProducto, String nombre, double precio, String talla, String color) {
        super(idProducto, nombre, precio);
        this.talla = talla;
        this.color = color;
    }
    
    //metodos
    public void ajustarTalla(String nuevaTalla){
        this.talla = nuevaTalla;
    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llama al método mostrarInfo() de la superclase
        System.out.println("Talla: " + talla);
        System.out.println("Color: " + color);
    }
    
}
