package Main;

public class Notebook extends Productos{
    private int resolucionPantalla;
    private String tipoTeclado;
    private int bateria;

    public Notebook(String marca, int RAM, int Almacenamiento, String procesador, String modelo, int fabricacion,
                    double precio, int stock, int resolucionPantalla, String tipoTeclado, int bateria) {
        super(marca, RAM, Almacenamiento, procesador, modelo, fabricacion, precio, stock);
        this.resolucionPantalla = resolucionPantalla;
        this.tipoTeclado = tipoTeclado;
        this.bateria = bateria;
    }

    public int getResolucionPantalla() {
        return resolucionPantalla;
    }

    public String getTipoTeclado() {
        return tipoTeclado;
    }

    public int getBateria() {
        return bateria;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "resolucionPantalla=" + resolucionPantalla +
                ", tipoTeclado='" + tipoTeclado + '\'' +
                ", bateria=" + bateria +
                super.toString() +
                '}';
    }
}
    

