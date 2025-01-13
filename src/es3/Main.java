package es3;

import entities.Articolo;
import entities.Carrello;
import entities.Cliente;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Tizio", "Caio", "tizio.caio@prova.com");
        System.out.println(cliente1);

        Articolo articolo1 = new Articolo("Penna", 1.5, 100);
        Articolo articolo2 = new Articolo("Quaderno", 2.5, 50);
        Articolo articolo3 = new Articolo("Libro", 10, 10);
        Articolo articolo4 = new Articolo("Matita", 0.5, 200);

        Carrello carrello1 = new Carrello(cliente1, new Articolo[]{articolo1, articolo2, articolo3, articolo4});
        printCarrello(carrello1);
    }

    public static void printCarrello(Carrello carrello) {
        System.out.println(carrello);
    }
}
