public class Products<T> {
    private static final String[]Nombre = {
            "PS5",
            "Steam Deck",
            "Nintendo Switch",
            "Macbook PRO",
            "Apple Watch",
            "Ipad",
            "Slimbook",
            "Vuforia smartglasses",
            "Google glass",
            "HTC Vibe",
            "Holo Lens"

    };
    private int precioProduct;

    @Override
    public String toString() {
        return "Products{" +
                "Nombre='" + Nombre + '\'' +
                ", precioProduct=" + precioProduct +
                '}';
    }

}
