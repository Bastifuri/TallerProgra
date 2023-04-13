
package Main;

public abstract class Productos {
    private String marca;
    private int RAM;
    private int Almacenamiento;
    private String procesador;
    private String modelo;
    private int fabricacion;
    private double precio;
    private int stock;

    public Productos(String marca, int RAM, int Almacenamiento, String procesador, String modelo, int fabricacion, double precio, int stock) {
        this.marca = marca;
        this.RAM = RAM;
        this.Almacenamiento = Almacenamiento;
        this.procesador = procesador;
        this.modelo = modelo;
        this.fabricacion = fabricacion;
        this.precio = precio;
        this.stock = stock;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getAlmacenamiento() {
        return Almacenamiento;
    }

    public void setAlmacenamiento(int Almacenamiento) {
        this.Almacenamiento = Almacenamiento;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(int fabricacion) {
        this.fabricacion = fabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
   public String getTipo() {
        return "Dispositivo";   
}
 public void disminuirStock(int cantidad) {
    if (cantidad > 0 && cantidad <= this.stock) {
        this.stock -= cantidad;
        System.out.println("Se han vendido " + cantidad + " unidades del dispositivo " + this.modelo + ". Stock actual: " + this.stock);
    } else {
        System.out.println("Error al disminuir el stock. La cantidad debe ser mayor a 0 y menor o igual que el stock actual.");
    }
}

}
