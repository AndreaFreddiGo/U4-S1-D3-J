package entities;

public class SIM {
    //    ATTRIBUTI
    private String numeroTelefono;
    private Double creditoResiduo;
    private Chiamata[] chiamateEffettuate;

    //    COSTRUTTORI
    public SIM(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.creditoResiduo = 0.0;
        this.chiamateEffettuate = new Chiamata[0];
    }

    //    METODI
    public void stampaSIM() {
        System.out.println("Numero: " + this.numeroTelefono);
        System.out.println("Credito: " + this.creditoResiduo);
        System.out.println("Chiamate effettuate: ");
        for (int i = 0; i < this.chiamateEffettuate.length; i++) {
            this.chiamateEffettuate[i].stampaChiamata();

        }
    }
}
