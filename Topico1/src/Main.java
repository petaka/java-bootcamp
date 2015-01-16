
import TransaccionObserver.Mail;
import java.util.Random;
import topico1.Carrito;
import topico1.Lista;
import topico1.Oferta;
import topico1.Producto;
import topico1.Singleton;
import topico1.Transaccion;

public class Main {

    public static Lista lista = new Lista();

    public static String[] arrayPago = new String[3];
    public static Oferta[] ofertas = new Oferta[3];
    public static Producto[] arrayProductos = new Producto[7];

    public static void init() {
        arrayPago[0] = "Efectivo";
        arrayPago[1] = "Tarjeta";
        arrayPago[2] = "PayPal";

        arrayProductos[0] = new Producto("Producto 1", (float) 1500.50, true);
        arrayProductos[1] = new Producto("Produto 2", 250, true);
        arrayProductos[2] = new Producto("Producto 3", 100, true);
        arrayProductos[3] = new Producto("Producto 4", (float) 2000.55, true);
        arrayProductos[4] = new Producto("Producto 5", 1980, true);
        arrayProductos[5] = new Producto("Producto 6", 450, true);
        arrayProductos[6] = new Producto("Producto 7", 3554, true);

        Oferta o1 = new Oferta("Oferta 1", 3500, true);
        o1.addProducto(arrayProductos[1]);
        o1.addProducto(arrayProductos[4]);
        ofertas[0] = o1;

        Oferta o2 = new Oferta("Oferta 2", 5000, true);
        o2.addProducto(arrayProductos[1]);
        o2.addProducto(arrayProductos[6]);
        o2.addProducto(arrayProductos[0]);
        ofertas[1] = o2;

        Oferta o3 = new Oferta("Oferta 3", 2000, true);
        o3.addProducto(arrayProductos[2]);
        o3.addProducto(arrayProductos[3]);
        o3.addProducto(arrayProductos[5]);
        ofertas[2] = o3;

        for (Producto arrayProducto : arrayProductos) {
            lista.addItem(arrayProducto);
        }
    }

    public static void main(String[] args) {
        init();

        Carrito carrito;
        Singleton singleton = Singleton.getInstance();
        Random r = new Random();

        for (int i = 0; i < 2; i++) {
            int pago = r.nextInt(3);
            String res = arrayPago[pago];
            carrito = new Carrito(singleton, res);

            int productos = r.nextInt(5);
            for (int j = 0; j < productos; j++) {
                int indexProducto = r.nextInt(5);
                Producto prod = arrayProductos[indexProducto];
                carrito.addProducto(prod);
            }

            carrito.setTotal();
            System.out.println("Numero de carro" + carrito);

            Transaccion transaccion = new Transaccion(carrito);
            transaccion.addObserver(new Mail());
            lista.addObserver(new Mail("mail"));
            transaccion.doNotify();
        }
    }

}
