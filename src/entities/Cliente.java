package entities;

import java.time.LocalDate;
import java.util.Random;

public class Cliente {
    //    ATTRIBUTI
    private int codiceCliente;
    private String nome;
    private String cognome;
    private String indirizzoEmail;
    private String dataIscrizione;

    //    COSTRUTTORI
    public Cliente(String nome, String cognome, String indirizzoEmail) {
        Random random = new Random();
        this.codiceCliente = random.nextInt(1, 1000);
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzoEmail = indirizzoEmail;
        LocalDate data = LocalDate.now();
        this.dataIscrizione = data.toString();
    }

    @Override
    public String toString() {
        return "Cliente{" + nome + " " + cognome +
                ", codiceCliente=" + codiceCliente +
                ", iscritto in data='" + dataIscrizione + '\'' +
                '}';
    }
}

