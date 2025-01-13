package entities;

import java.util.Arrays;

public class Carrello {
    //    ATTRIBUTI
    private Cliente cliente;
    private Articolo[] articoli;
    private double totaleCosto;

    //    COSTRUTTORI
    public Carrello(Cliente cliente, Articolo[] articoli) {

        this.cliente = cliente;
        this.articoli = articoli;
        this.totaleCosto = 0;
        for (int i = 0; i < articoli.length; i++) {
            totaleCosto = totaleCosto + articoli[i].prezzo;
        }
    }

    @Override
    public String toString() {
        return "Carrello{" + cliente +
                ", articoli=" + Arrays.toString(articoli) +
                ", totaleCosto=" + totaleCosto +
                '}';
    }
}
