package entidades;

/**
 * Created by NACHZEHER on 24/10/2017.
 */
public class RopaMixta extends Local {
    private  String tipoLocal = "Tienda ropa mixta";
    private  float baseImpue = 1.0f;

    public RopaMixta(){
    }

    public RopaMixta(String nomLoal, String horario, int numEmpleados, float tamaño) {
        super(nomLoal, horario, numEmpleados, tamaño);


    }

    public String getTipoLocal() {
        return tipoLocal;
    }

    public float getBaseImpue() {
        return baseImpue;
    }


    @Override
    public float totalImpuestos() {
        float total = tamaño * baseImpue;
        return total;
    }

    @Override
    public String toString() {
        return super.toString()+ " " + tipoLocal + " " + totalImpuestos()+ "€" + "\n          ";
    }
}
