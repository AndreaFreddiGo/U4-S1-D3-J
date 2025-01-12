package es1;

import entities.Rettangolo;

public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo1 = new Rettangolo(10, 15);
        Rettangolo rettangolo2 = new Rettangolo(8, 20);

        stampaRettangolo(rettangolo1);
        stampaDueRettangoli(rettangolo1, rettangolo2);
    }

    public static void stampaRettangolo(Rettangolo r) {
        System.out.println("L'area del rettangolo è: " + r.area());
        System.out.println("Il perimetro del rettangolo è: " + r.perimetro());
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("L'area del rettangolo 1 è: " + r1.area());
        System.out.println("Il perimetro del rettangolo 1 è: " + r1.perimetro());
        System.out.println("L'area del rettangolo 2 è: " + r2.area());
        System.out.println("Il perimetro del rettangolo 2 è: " + r2.perimetro());
        System.out.println("La somma delle aree è: " + (r1.area() + r2.area()));
        System.out.println("La somma dei perimetri è: " + (r1.perimetro() + r2.perimetro()));
    }
}