package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NACHZEHER on 24/10/2017.
 */
public class CentroComercial {
    private String nomCentro;
    public static int numLocales = 0;
    private ArrayList<Local> locales= new ArrayList<>();

    public CentroComercial(String nomCentro) {
        this.nomCentro = nomCentro;
    }

    public String getNomCentro() {
        return nomCentro;
    }

    public int getNumLocales() {
        return numLocales;
    }

    public List<Local> getLocales() {
        return locales;
    }

    public void setNomCentro(String nomCentro) {
        this.nomCentro = nomCentro;
    }

    public void addLocal(Local local){
        locales.add(local);
    }

    @Override
    public String toString() {
        return "Centro: " + nomCentro +
                "\nCantidad de locales: " + numLocales +
                "\nlocales:   " + locales;
    }
}
