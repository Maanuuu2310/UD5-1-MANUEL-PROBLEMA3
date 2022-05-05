public class Products<T> {
    private String Nombre;
    private int precioProduct;

    @Override
    public String toString() {
        return "Products{" +
                "Nombre='" + Nombre + '\'' +
                ", precioProduct=" + precioProduct +
                '}';
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getPrecioProduct() {
        return precioProduct;
    }

    public void setPrecioProduct(int precioProduct) {
        this.precioProduct = precioProduct;
    }
}
