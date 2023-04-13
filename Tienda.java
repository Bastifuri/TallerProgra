package Main;

import java.util.ArrayList;
import java.util.Date;

public class Tienda {
    private String direccion;
    private ArrayList<Productos> catalogo;
    private ArrayList<Cliente> clientes;
    private ArrayList<Venta> ventas;
    
    public Tienda(String direccion) {
        this.direccion = direccion;
        this.catalogo = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.ventas = new ArrayList<>();
    }
    
    public void agregarDispositivo(Productos dispositivo) {
        catalogo.add(dispositivo);
    }
    
    public ArrayList<Productos> buscarDispositivo(String tipo, String marca, String modelo) {
        ArrayList<Productos> dispositivosEncontrados = new ArrayList<>();
        for (Productos productos : catalogo) {
            if (productos.getTipo().equals(tipo) &&
                productos.getMarca().equals(marca) &&
                productos.getModelo().equals(modelo)) {
                dispositivosEncontrados.add(productos);
            }
        }
        return dispositivosEncontrados;
    }
    
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
}

