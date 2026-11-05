package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Szemelyek {
    private ArrayList<Szemely> szemelyek = new ArrayList<Szemely>();

    public Szemelyek() {
        feltolt();
    }

    private void feltolt(){
        szemelyek.add(new Anna("Béla", true, false));
        szemelyek.add(new Bela("Csaba", true, false));
        szemelyek.add(new Csaba("Nem Béla", true, false));
        szemelyek.add(new David("Nem Csaba", true, false));
        
    }

    public List<Szemely> getSzemelyek() {
        return Collections.unmodifiableList(szemelyek);
    }

    @Override
    public String toString() {
        String szoveg = "";
        for (Szemely szemely : szemelyek) {
            szoveg += szemely.toString();
            szoveg += "\n\n";
        }
        return szoveg;
    }
    
    public String oVoltE(int szam){
        String sz = "nem";
        
        if(szemelyek.get(szam).isTettes()){
            sz = "igen";
        }
        return sz;
    }
    
    
}
