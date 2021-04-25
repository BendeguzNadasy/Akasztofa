package akasztofa;

import java.io.Serializable;
import java.util.ArrayList;

public class Jatekos implements Serializable{
    private ArrayList<String> tippeltBetuk;

    public Jatekos() {
        tippeltBetuk = new ArrayList<>();
    }
    
    public boolean addTipp(String c) {
        boolean benneVan;
        if (!tippeltBetuk.contains(c)) {
            tippeltBetuk.add(c);
            benneVan = false;
        }
        else {
            benneVan = true;
        }
        return benneVan;
    }

    public ArrayList<String> getTippeltBetuk() {
        return tippeltBetuk;
    }
    
    
    
    
}
