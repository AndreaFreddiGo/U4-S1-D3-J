package entities;

public class Chiamata {
    // ATTRIBUTI
    private String numeroChiamato;
    private int durata;

    public void stampaChiamata() {
        System.out.println("Numero chiamato: " + this.numeroChiamato);
        System.out.println("Durata: " + this.durata);
    }
}
