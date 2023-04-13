package Main;

import java.util.List;

public class Tablet extends Productos{

    private String resolucionPantalla;
    private List<String> accesoriosIncorporados;

    public Tablet(String marca, int RAM, int Almacenamiento, String procesador, String modelo, int fabricacion, double precio, int stock, String resolucionPantalla, List<String> accesoriosIncorporados) {
        super(marca, RAM, Almacenamiento, procesador, modelo, fabricacion, precio, stock);
        this.resolucionPantalla = resolucionPantalla;
        this.accesoriosIncorporados = accesoriosIncorporados;
    }

    public String getResolucionPantalla() {
        return resolucionPantalla;
    }

    public List<String> getAccesoriosIncorporados() {
        return accesoriosIncorporados;
    }

    public void setResolucionPantalla(String resolucionPantalla) {
        this.resolucionPantalla = resolucionPantalla;
    }

    public void setAccesoriosIncorporados(List<String> accesoriosIncorporados) {
        this.accesoriosIncorporados = accesoriosIncorporados;
    }
}

    
