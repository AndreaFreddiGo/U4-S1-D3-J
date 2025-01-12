package entities;

public class Rettangolo {

    // ATTRIBUTI
    private int altezza;
    private int larghezza;

    // COSTRUTTORI
    public Rettangolo(int altezza, int larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    // METODI
    public int area() {
        return this.altezza * this.larghezza;
    }

    public int perimetro() {
        return 2 * (this.altezza + this.larghezza);
    }


}
