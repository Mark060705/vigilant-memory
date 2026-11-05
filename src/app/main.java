package app;

import model.Szemelyek;
import nezet.KonzolNezet;

public class main {

    public static void main(String[] args) {
        Szemelyek sz = new Szemelyek();
        KonzolNezet.kiirAllitasok(sz.toString());
        int sorszam = KonzolNezet.beker();
        KonzolNezet.kiir(sz.oVoltE(sorszam));
    }
    
}
