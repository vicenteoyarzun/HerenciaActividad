
package herenciaactividad;
public class Electronico extends Producto {
    //atributos
    private String marca;
    private int garantiaMeses;

    //constructor
    public Electronico(String idProducto, String nombre, double precio, String marca, int garantiaMeses) {
        super(idProducto, nombre, precio);
        this.marca = marca;
        this.garantiaMeses = garantiaMeses;
    }
    
    //metodos
    public void extenderGarantia(int mesesExtra){
        this.garantiaMeses += mesesExtra;//aumenta los meses de garantia
    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llama al método mostrarInfo() de la superclase
        System.out.println("Marca: " + marca);
        System.out.println("Garantía (meses): " + garantiaMeses);
    }
}
