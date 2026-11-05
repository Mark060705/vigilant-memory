package model;

public class Szemely {
    private final String nev;
    private String allitas;
    private boolean igaz, tettes;

    public Szemely(String allitas, boolean igaz, boolean tettes, String nev) {
        this.allitas = allitas;
        this.igaz = igaz;
        this.tettes = tettes;
        this.nev = nev;
        
    }

    public String getNev() {
        return nev;
    }

    public String getAllitas() {
        return allitas;
    }

    public boolean isIgaz() {
        return igaz;
    }

    public boolean isTettes() {
        return tettes;
    }

    @Override
    public String toString() {
        return "nev: " + nev + "\nallitas: " + allitas;
    }
    
    

            
            
}
