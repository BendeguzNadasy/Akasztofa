package akasztofa;

import java.io.Serializable;
import java.util.ArrayList;

public class Jatekos implements Serializable{
    
    private ArrayList<String> tippeltBetuk;
    private int hdb;
    
    public Jatekos() {
        hdb = 0;
        tippeltBetuk = new ArrayList<>();
    }

    public void setHdb(int hdb) {
        this.hdb = hdb;
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
    
    public void listaUrit() {
        tippeltBetuk.clear();
    }
    
    
}
