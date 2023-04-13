
package Main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venta {
    private List<Productos> productos;
    private Cliente cliente;
    private Date fecha;

    public Venta(List<Productos> productos, Cliente cliente, Date fecha) {
        this.productos = productos;
        this.cliente = cliente;
        this.fecha = fecha;
    }

    public List<Productos> getProductos() {
        return productos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public double getTotalVenta() {
        double total = 0;
        for (Productos dispositivo : productos) {
            total += dispositivo.getPrecio();
        }
        return total;
    } 
    public void realizarCompra(Cliente cliente, Productos[] productos) {
    double total = 0;
    for (Productos producto : productos) {
        total += producto.getPrecio();
        producto.disminuirStock(1);
    }
    Venta venta = new Venta(productos, cliente, new Date());
    ventas.add(venta);
    System.out.println("Compra realizada exitosamente por un total de: $" + total);
}
}
