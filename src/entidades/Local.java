package entidades;

/**
 * Created by NACHZEHER on 24/10/2017.
 */
public abstract class Local {
    protected String nomLoal;
    protected String horario;
    protected int NumEmpleados;
    protected float tamaño;

    public Local(){}

    public Local(String nomLoal, String horario, int numEmpleados, float tamaño) {
        this.nomLoal = nomLoal;
        this.horario = horario;
        NumEmpleados = numEmpleados;
        this.tamaño = tamaño;
    }

    public String getNomLoal() {
        return nomLoal;
    }

    public String getHorario() {
        return horario;
    }

    public int getNumEmpleados() {
        return NumEmpleados;
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setNomLoal(String nomLoal) {
        this.nomLoal = nomLoal;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setNumEmpleados(int numEmpleados) {
        NumEmpleados = numEmpleados;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }

    public abstract float totalImpuestos();

    @Override
    public String toString() {
        return nomLoal;
    }


}
