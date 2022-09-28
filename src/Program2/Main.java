package Program2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Porta p = new Porta();

        p.abre();
        p.pinta("branca");
        p.setDimensaoX(2.00);
        p.setDimensaoY(2.20);
        p.setDimensaoZ(1.80);
        p.estaAberta();

        p.fecha();
        p.pinta("marrom");
        p.setDimensaoX(1.50);
        p.setDimensaoY(1.70);
        p.setDimensaoZ(1.80);
        p.estaAberta();

        p.abre();
        p.pinta("preta");
        p.setDimensaoX(3.00);
        p.setDimensaoY(2.60);
        p.setDimensaoZ(2.80);
        p.estaAberta();

        sc.close();
    }
}
