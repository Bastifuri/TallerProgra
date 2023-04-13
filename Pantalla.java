package Main;

public class Pantalla {
    private String marcaP;
    private String modeloP;
    private int fabricacionP;

    public Pantalla(String marca, String modelo, int anioFabricacion) {
        this.marcaP = marcaP;
        this.modeloP = modeloP;
        this.fabricacionP = fabricacionP;
    }

    public String getMarcaP() {
        return marcaP;
    }

    public String getModeloP() {
        return modeloP;
    }

    public int getFabricacionP() {
        return fabricacionP;
    }
}
