package entities;

import java.util.Random;

public class Articolo {
    public double prezzo;
    //    ATTRIBUTI
    private int codiceArticolo;
    private String descrizioneArticolo;
    private int quantita;

    //    COSTRUTTORI
    public Articolo(String descrizioneArticolo, double prezzo, int quantita) {
        Random random = new Random();
        this.codiceArticolo = random.nextInt(1000, 9999);
        this.descrizioneArticolo = descrizioneArticolo;
        this.prezzo = prezzo;
        this.quantita = quantita;
    }

    @Override
    public String toString() {
        return descrizioneArticolo;
    }
}